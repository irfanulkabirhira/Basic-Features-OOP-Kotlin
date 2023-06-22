class Nira {
    private var name: String = ""
    private var age: Int = 0

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getAge(): Int {
        return age
    }

    fun setAge(age: Int) {
        this.age = age
    }
}

fun main() {
    val n1 = Nira()
    n1.setName("Anis")
    n1.setAge(23)
    println(n1.getName())
    println(n1.getAge())
}
