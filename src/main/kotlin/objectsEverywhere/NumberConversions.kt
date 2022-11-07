package objectsEverywhere

fun fraction(numerator: Long, denom: Long) = numerator.toDouble() / denom

fun main() {
    val num = 1
    val den = 2
    // As conversões entre tipos numéricos são feitas explicitamente para evitar confusão
    val f = fraction(num.toLong(), den.toLong())
    println(f)
}