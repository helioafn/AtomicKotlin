package expressionsAndStatements

fun main() {
    var i = 10
    println(i++)  // 10
    println(i)  // 11
    var j = 20
    println(++j)  // 21
    println(j)  // 21

    // Não usar os operadores de incremento e decremento em outras expressões pois gera confusão
    i = 1
    println(i++ + ++i)  // 1 + ++2 = 4
}