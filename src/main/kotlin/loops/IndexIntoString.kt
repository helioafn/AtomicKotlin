package loops

fun main() {
    val s = "abc"

    for (i in 0..s.lastIndex) {
        print(s[i] + 1)
    }
    println()

    val ch: Char = 'a'
    println(ch - 1)
    println(ch + 10)
    println(ch < 'f')  // Comparando valores da tabela ASCII

    // Iterando sobre uma string
    for (ch in "Jnskhm ")
        print(ch + 1)
}