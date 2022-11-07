package visibility

fun main() {
    // Não é possível acessar membros privados declarados em outro arquivo

//    Can't access: it's private in file
//    val rabbit = Animal("Rabbit")
//    recordAnimal(rabbit)
//    index++

    recordAnimals()
    recordAnimalsCount()
}