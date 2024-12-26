package OOPS_Concepts
interface Vehicle {
    // Abstract methods
    fun startEngine()
    fun stopEngine()

    // Abstract property
    val numberOfWheels: Int
}

class Car : Vehicle {
    override fun startEngine() {
        println("Car engine started")
    }

    override fun stopEngine() {
        println("Car engine stopped")
    }

    override val numberOfWheels: Int = 4
}

fun main() {
    val car = Car()
    car.startEngine()
    println("Number of wheels: ${car.numberOfWheels}")
    car.stopEngine()
}

