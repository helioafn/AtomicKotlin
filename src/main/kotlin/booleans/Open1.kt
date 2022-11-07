package booleans

fun isOpen(hour: Int) {
    // Check if the store is currently open
    val open = 9
    val closed = 20
    println("Operating hours: $open - $closed")
    val status = hour in open..closed // O mesmo que hour >= open && hour <= closed
    println("Open: $status")
}
//    && (E lógico): true se as expressões de ambos os lados do operador forem true, caso contrário false.
//    || (OU lógico): true se umas das expressões for true, ou se ambas forem true, caso contrário false.


// main() só tem uma única chamada de função, então podemos usar corpo de expressão (expression body, tradução literal
// lol)
fun main() = isOpen(22)
