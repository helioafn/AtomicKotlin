package numberTypes

fun main() {
    val numerator: Int = 19
    val denominator: Int = 10
    println(numerator / denominator)  // Will truncate the decimal part
    println(numerator / (denominator * 1.0))  // Result is a double

}