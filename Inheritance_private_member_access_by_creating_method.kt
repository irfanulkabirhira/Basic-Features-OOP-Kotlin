open class Person4 {
    private var name: String = ""

    fun setName(name: String) {
        this.name = name
    }

    private fun getName(): String {
        return name
    }

    fun displayInformation() {
        println("Name: ${getName()}")
    }
}

class Teacher4 : Person4() {
    fun setNameAndDisplay(name: String) {
        setName(name)
        displayInformation()
    }
}

fun main() {
    val teacher = Teacher4()
    teacher.setNameAndDisplay("Hira")
}
