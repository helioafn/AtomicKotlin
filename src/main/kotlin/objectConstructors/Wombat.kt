package objectConstructors

class Wombat
class Alien(name: String) {
    val greeting = "Poor $name"
}

class AlienSpecies(
    private val name: String,
    private val eyes: Int,
    private val hands: Int,
    private val legs: Int) {
    fun describe() = "$name with $eyes eyes, $hands and $legs legs"
    // Sobrescrevendo o método toString() padrão
    override fun toString(): String = "Alien: ($name)"
}
fun main() {
    val wombat = Wombat()
    val alien = Alien("Mr. Meeseeks")
    println(alien.greeting)
    // println(alien.name)
    val kevin = AlienSpecies("Zigerion", 2, 3, 4)
    val mortyJr = AlienSpecies("Gazorpian", 2, 6, 2)
    println(kevin.describe())
    println(mortyJr.describe())
    // Se um objeto é chamado onde uma string é esperada, o método toString() do objeto é chamado,
    // se você não escreveu um, você ainda tem o toString() padrão que retorna: ClassName@EndereçoNaMemória
    println(kevin)
    println(mortyJr)

}