package atomictest

import kotlin.math.abs
import kotlin.reflect.KClass

const val ERROR_TAG = "[Error]: "

private fun <L, R> test(
    actual: L,
    expected: R,
    checkEquals: Boolean = true,
    predicate: () -> Boolean
) {
    println(actual)
    if (!predicate()) {
        print(ERROR_TAG)
        println("$actual (${if (checkEquals) "!=" else "=="} $expected)")
    }

    /*
        Compara a representação da string desse objeto com a string 'rval'
     */
    infix fun Any.eq(rval: String) {
        test(this, rval) {
            toString().trim() == rval.trimIndent()
        }
    }

    /*
        Verifica se esse objeto é igual a 'rval'
     */
    infix fun <T> T.eq(rval: T) {
        test(this, rval) {
            this == rval
        }
    }

    /*
       Verifica se o objeto != 'rval'
    */
    infix fun <T> T.neq(rval: T) {
        test(this, rval, checkEquals = false) {
            this != rval
        }
    }

    /*
        Verifica se um número do tipo 'Double' é igual a 'rval'
        dentro de um delta positivo
     */
    infix fun Double.eq(rval: Double) {
        test(this, rval) {
            abs(this - rval) < 0.0000001
        }
    }

    /*
        Segura informação capturada de excessões
     */

    class CapturedException(
        private val exceptionClass: KClass<*>?,
        private val actualMessage: String
    ) {
        private val fullMessage: String
            get() {
                val className = exceptionClass?.simpleName ?: ""
                return className + actualMessage
            }

        infix fun eq(message: String) {
            fullMessage eq message
        }

        infix fun contains(parts: List<String>) {
            if (parts.any { it !in fullMessage }) {
                print(ERROR_TAG)
                println("Actual message: $fullMessage")
                println("Expected parts: $parts")
            }
        }

        override fun toString() = fullMessage
    }

    /*
        Captura uma excessão e produz informações sobre ela.
        Uso: capture { // codigo que falha } eq "FailureException: message"
     */

    fun capture(f: () -> Unit): CapturedException =
        try {
            f()
            CapturedException(null, "$ERROR_TAG Expected an exception")
        } catch (e: Throwable) {
            CapturedException(e::class, (e.message?.let { ":$it" } ?: ""))
        }


}

/*
        Acumula saídas quando é chamada, como em:
            trace("info")
            trace(object)
        Depois compara acumulados com esperado:
            trace eq "expected output"
*/
object trace {
    private val trc = mutableListOf<String>()
    operator fun invoke(obj: Any?) {
        trc += obj.toString()
    }

    /*
        Compara conteúdo de trc a uma string de multiplas linhas ignorando espaço em branco
     */

    infix fun eq(multiline: String) {
        val trace = trc.joinToString("\n")
        val expected = multiline.trimIndent().replace("\n", " ")
        test(trace, multiline) {
            trace.replace("\n", " ") == expected
        }
        trc.clear()
    }
}