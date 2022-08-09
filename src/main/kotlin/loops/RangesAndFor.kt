package loops

fun showRange(r: IntProgression) {
    for (i in r) {
        print("$i ")
    }
    print("     //$r")
    println()
}
fun main() {
    for (i in 1..3) {
        println("Hey $i!")
    }

    val range1 = 1..10
    val range2 = 0 until 10

    showRange(1..5)
    showRange(0 until 5)
    showRange(5 downTo 1)
    showRange(0..9 step 2)
    showRange(0 until 10 step 3)
    showRange(9 downTo 2 step 3)

    for (letter in 'a' until 'f') print(letter)
    println()
    for (letter in 'z' downTo 'h') print(letter)
    println()
    for (letter in 'a'..'h' step 3) print(letter)

}