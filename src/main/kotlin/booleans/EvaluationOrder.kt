package booleans

fun main() {
    val sunny = true
    val hoursSleep = 6
    val exercise = false
    val temp = 55
    // (&&) são calculados primeiros que (||)
    val happy1 = sunny && temp > 50 || exercise && hoursSleep > 7
    println(happy1)  // true?
    val sameHappy1 = (sunny && temp > 50) || (exercise && hoursSleep > 7)
    println(sameHappy1) // true
    val notSame = (sunny && temp > 50 || exercise) && hoursSleep > 7
    println(notSame) // false

    checkRelations(4, 5)
}

fun checkRelations(x: Int, y: Int) {
    println("x = y? ${x == y}")
    println("x != y? ${x != y}")
    println("x > y? ${x > y}")
    println("x < y? ${x < y}")
    println("x >= y? ${x >= y}")
    println("x <= y? ${x <= y}")
}