package inKeyword

fun main() {
//    a palavra-chave 'in' testa se um valor está em um intervalo.
//    se dentro de um loop for, significa iteração, caso contrário checa se é membro.
    val percent = 35
    println(percent in 1..100)

    val values = 1..3
    for (v in values) {
        println("iteration $v")
    }

    val v = 2

    if (v in values) {
        println("$v is a member of $values")
    }
//    'in' não é limitado a intervalos, pode ser usado para checar se um caractere faz parte de uma String.
    println('k' in "kotlin")
    println('a' in "kotlin")

    println(isDigit('a'))
    println(isDigit('3'))
    println(notDigit('z'))

}

//    'in' checando se um caractere pertence a um intervalo de caracteres
fun isDigit(ch: Char) = ch in '0'..'9'

//     'in checando se um caractere não pertence a um intervalo de caracteres
fun notDigit(ch: Char) = ch !in '0'..'9'

