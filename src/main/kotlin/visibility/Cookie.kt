package visibility


// Privacidade é comumente usado para membros de uma classe
class Cookie(
    private var isReady: Boolean
) {
    private fun crumble() = println("crumble")
    public fun bite() = println("bite") // ide reclama de public redundante
    fun eat() {
        isReady = true
        crumble()
        bite()
    }
}

fun main() {
    val x = Cookie(false)
    x.bite()

    // Não é possível acessar membros privados
//    x.isReady
//    x.crumble()
    x.eat()
}