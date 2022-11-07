package functions

// Declaração de uma função com corpo
fun multiplyByTwo(x: Int): Int {
    println("Inside mulitplyByTwo")
    return x * 2
}
// Declarando uma função expressão
// Declarando o tipo de retorno explicitamente
fun multiplyByThree(x: Int): Int = x * 3

// Deixando o compilador inferir o tipo do retorno
fun powerTwo(x: Int) = x * x

fun main() {
    val result = multiplyByTwo(5)
    println(result)

    val tripled = multiplyByThree(9)
    println(tripled)

    val powered = powerTwo(5)
    println(powered)
}