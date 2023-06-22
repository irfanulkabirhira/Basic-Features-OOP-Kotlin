package OOp_Features.Polymorphism

open class Shape1 {
    open fun area(): Double {
        println("Shape1 area")
        return 0.0
    }
}

class Rectangle1(private val length: Double, private val width: Double) : Shape() {
    override fun area(): Double {
        println("Area for rectangle1")
        return length * width
    }
}

class Triangle1(private val base: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        println("Area for triangle1")
        return 0.5 * base * height
    }
}

fun main() {
    val s: Array<Shape> = arrayOf(
        Shape(),
        Rectangle1(10.0, 20.0),
        Triangle1(20.0, 30.0)
    )

    for (i in s.indices) {
        println(s[i].area())
    }
}
