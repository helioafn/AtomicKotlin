package inKeyword

fun main() {
    // Pode checar uma string é membro de um intervalo de Strings
    // Kotlin usa comparação alfabética para checagem
    println("ab" in "aa".."az")
    println("ba" in "aa".."az")
}