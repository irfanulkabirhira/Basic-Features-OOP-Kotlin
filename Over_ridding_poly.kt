package OOp_Features.Polymorphism

open class Person8 {
    var name: String = ""
    var age: Int = 0

    open fun display() {
        println("name: $name")
        println("age: $age")
    }
}

class Teacher : Person8() {
    var qualification: String = ""

    override fun display() {
        println("qualification: $qualification")
    }
}

fun main() {
    val p: Person8 = Person8() // super class er object
    p.display()
    val t: Person8 = Teacher() // subclass er object
    t.display()
}
