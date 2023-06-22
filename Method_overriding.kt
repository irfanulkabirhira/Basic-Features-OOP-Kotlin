package OOp_Features.INHERITANCE

open class Person4 {
    var name: String = ""
    var age: Int = 0

    open fun displayInformation() {
        println("Name: $name")
        println("Age: $age")
    }
}

class Teacher4 : Person4() {
    var qualification: String = ""

    override fun displayInformation() {
        super.displayInformation()
        println("Qualification: $qualification")
    }
}

fun main() {
    val t1 = Teacher4()
    t1.name = "Hira"
    t1.age = 23
    t1.qualification = "B.Sc"
    t1.displayInformation()
}
