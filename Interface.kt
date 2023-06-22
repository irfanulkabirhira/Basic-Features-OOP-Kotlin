package OOp_Features.Abstraction

interface Animal {
    fun eat()
}

class Dog : Animal {
    override fun eat() {
        println("Dog can eat")
    }
}

fun main() {
    val s: Animal = Dog()
    s.eat()
    // Animal interface er object create kora jabe na
    // because Animal is an interface
}
