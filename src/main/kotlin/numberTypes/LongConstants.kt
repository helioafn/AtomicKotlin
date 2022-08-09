package numberTypes

fun main() {
    val i = 0  // Compiler infers Int
    val l1 = 0L  // the L will make the compiler infer a Long type to l1
    val l2: Long = 0  // Explicitly declaring a Long variable

    println("$l1 $l2")
}