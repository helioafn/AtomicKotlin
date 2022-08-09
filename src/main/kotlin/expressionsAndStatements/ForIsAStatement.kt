package expressionsAndStatements

fun unitFun() = Unit

fun main() {
    println(unitFun())
    val u1: Unit = println(42)
    println(u1)
    val u2 = println(0)  // Type inference
    println(u2)

    val result1 = if (11 > 42) 9 else 5

    val result2 = if (1 < 2) {
        val a = 11
        a + 42
    } else 42

    val result3 =
        if ('x' < 'y')
            println("x < y")
        else
            println("x > y")

    println(result1)
    println(result2)
    println(result3)

}