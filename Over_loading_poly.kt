package OOp_Features.Polymorphism

class Overload10 {
    fun add(a: Double, b: Double) {
        println(a + b)
    }

    fun add(a: Int, b: Int, c: Int) {
        println(a + b + c)
    }

    fun add() {
        println("Nothing is added")
    }
}

fun main() {
    val ob = Overload10()
    ob.add()
    ob.add(6.5, 5.5)
    ob.add(5, 10, 20)
}
