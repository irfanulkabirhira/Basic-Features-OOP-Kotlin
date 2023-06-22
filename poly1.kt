package OOp_Features.Polymorphism

open class Person3 {
    open fun display() {
        println("I am a person")
    }
}

class Teacher3 : Person3() {
    override fun display() {
        println("I am a teacher")
    }
}

class Student : Person3() {
    override fun display() {
        println("I am a student")
    }
}

fun main() {
    var p: Person3 = Person3()
    p.display()
    p = Teacher3()
    p.display()
    p = Student()
    p.display()
}
