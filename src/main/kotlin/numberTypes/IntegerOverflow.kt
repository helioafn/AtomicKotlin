package numberTypes

fun main() {
    val i: Int = Int.MAX_VALUE
    println(i + i)  // Generates a overflow

    // Preventing Int overflow using Long
    println(0L + i + i)
    println(1_000_000 * 1_000_000L)

    println("The maximum value for a Long is ${Long.MAX_VALUE}")
}