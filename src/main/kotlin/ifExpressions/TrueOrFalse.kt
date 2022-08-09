package ifExpressions

fun trueOrFalse(exp: Boolean): String {
    return if (exp)
        "It's true!"
    else
        "It's false"
}

fun oneOrTheOther(exp: Boolean): String =
    if (exp)
        "True"
    else
        "False"


fun main() {
    val b = 1
    println(trueOrFalse(b < 3))
    println(trueOrFalse(b >= 3))

    println(oneOrTheOther(b > 0))
    println(oneOrTheOther(b != 0))
}