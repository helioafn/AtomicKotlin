package loops

fun hasChar(s: String, ch: Char): Boolean {
    for (c in s) {
        if (c == ch) return true
    }
    return false
}

fun main() {
    println(hasChar("Hélio", 'o'))
    println(hasChar("Kuma", 'k'))

}