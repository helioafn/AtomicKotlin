package inKeyword

// 'in' em intervalos Double só pode ser usado para checagem de membro (pertence-a)
// range de Double só pode ser criado com ..
fun inFloatRange(n: Double) {
    val r = 1.0..10.0
    println("$n in $r? ${n in r}")
}

fun main() = inFloatRange(3.33333)