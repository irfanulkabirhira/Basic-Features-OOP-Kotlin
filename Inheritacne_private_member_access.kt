open class Person {
    private var name: String = ""

    fun setName(name: String) {
        this.name = name
    }

    fun getName(): String {
        return name
    }
}

class Teacher : Person() {
    fun displayInformation() {
        println("Name: ${getName()}")
    }
}

fun main() {
    val teacher = Teacher()
    teacher.setName("Hira")
    teacher.displayInformation()
}
