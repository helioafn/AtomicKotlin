package booleans

fun isClosed(hour: Int) {
    // Check if the store is currently closed
    val open = 9
    val closed = 20
    println("Operating hours $open - $closed")
    val status = hour < open || hour > closed
    println("Closed: $status")
}

fun main() = isClosed(21)