package OOp_Features.Abstraction

// super class
// this is not 100% abstract because it contains a non-abstract method
abstract class MobileUser1 {
    abstract fun sendDM() // abstract method

    fun cell() { // non-abstract method
        println("call method")
    }
}

class Rahim1 : MobileUser1() {
    // inherit the call and sendDM methods
    override fun sendDM() {
        println("I am Rahim")
    }
}

class Karim1 : MobileUser1() {
    // inherit the call and sendDM methods
    override fun sendDM() {
        println("I am Karim")
    }
}

fun main() {
    var mu: MobileUser1 // reference variable
    mu = Rahim1()
    mu.cell()
    mu.sendDM()

    mu = Karim1()
    mu.sendDM()
}
