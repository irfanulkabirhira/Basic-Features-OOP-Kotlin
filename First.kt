package OOp_Features.INHERITANCE

open class Person {
    var name: String = ""
    var age: Int = 0

    fun displayInformation1() {
        println("Name: $name")
        println("Age: $age")
    }
}

class Teacher : Person() {
    var qualification: String = ""

    fun displayInformation2() {
        displayInformation1()
        println("Qualification: $qualification")
    }
}

fun main() {
    val t1 = Teacher()
    t1.name = "Hira"
    t1.age = 23
    t1.qualification = "B.Sc"
    t1.displayInformation2()
    println()

    val t2 = Teacher()
    t2.name = "Iira"
    t2.age = 17
    t2.qualification = "M.Sc"
    t2.displayInformation2()
}
