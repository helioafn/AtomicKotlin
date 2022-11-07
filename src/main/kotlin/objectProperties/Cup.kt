package objectProperties

class Cup {
    var percentFull = 0 // Propriedade
}

class Cup2 {
    var percentFull = 0
    val max = 100
    fun add(increase: Int): Int {
        percentFull += increase
        if (percentFull > max) percentFull = max
        return percentFull
    }
}
fun main() {
    val c1 = Cup()
    c1.percentFull = 50 // Acessando a propriedade
    val c2 = Cup()
    c2.percentFull = 100

    println(c1.percentFull)
    println(c2.percentFull)

    val cup2 = Cup2()
    cup2.add(50)
    println(cup2.percentFull)
    cup2.add(70)
    println(cup2.percentFull)

}