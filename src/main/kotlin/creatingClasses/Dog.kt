package creatingClasses

class Dog {
    fun bark() = "yip!"
}

fun main() {
    val dog = Dog()
    println(dog.bark())
}