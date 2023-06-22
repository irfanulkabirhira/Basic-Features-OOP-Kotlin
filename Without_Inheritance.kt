package OOp_Features.INHERITANCE

class Person1 {
    var name: String = ""
    var age: Int = 0

    fun displayInformation1() {
        println("Name: $name")
        println("Age: $age")
    }
}

class Teacher1 {
    var name: String = ""
    var age: Int = 0
    var qualification: String = ""

    fun displayInformation2() {
        println("Name: $name")
        println("Age: $age")
        println("Qualification: $qualification")
    }
}

fun main() {
    val t1 = Teacher1()
    t1.name = "Hira"
    t1.age = 30
    t1.qualification = "B.Sc"
    t1.displayInformation2()
    println()

    val t2 = Teacher1()
    t2.name = "Mira"
    t2.age = 17
    t2.qualification = "M.Sc"
    t2.displayInformation2()
}
