package OOp_Features.Polymorphism

open class Shape {
    open fun area(): Double {
        println("Shape area")
        return 0.0
    }
}

class Rectangle(private val length: Double, private val width: Double) : Shape() {
    override fun area(): Double {
        println("Area for rectangle")
        return length * width
    }
}

class Triangle(private val base: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        println("Area for triangle")
        return 0.5 * base * height
    }
}

fun main() {
    val s1: Shape = Shape()
    val s2: Shape = Rectangle(10.0, 20.0)
    val s3: Shape = Triangle(10.0, 20.0)
    println(s1.area())
    println(s2.area())
    println(s3.area())
}
