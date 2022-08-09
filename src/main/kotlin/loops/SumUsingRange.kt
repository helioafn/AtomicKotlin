package loops

fun main() {
    var sum = 0
    for (n in 1..100) {
        sum += n
    }

    println("sum = $sum")
}