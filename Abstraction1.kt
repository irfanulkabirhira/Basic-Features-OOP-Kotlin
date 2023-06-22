package OOp_Features.Abstraction

// super class
// this is 100% abstract
abstract class MobileUser {
    abstract fun sendDM() // abstract method, no body
}

class Rahim : MobileUser() {
    override fun sendDM() {
        println("I am Rahim")
    }
}

class Karim : MobileUser() {
    override fun sendDM() {
        println("I am Karim")
    }
}

fun main() {
    var mu: MobileUser // reference variable
    mu = Rahim()
    mu.sendDM()

    mu = Karim()
    mu.sendDM()
}
