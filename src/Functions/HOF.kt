package Functions

fun main() {
    // Get a function for addition
    val addFunction: (Int, Int) -> Int = getOperation("add")
    // addFunction = { a,b -> a + b }
    println("Addition Result: ${addFunction(10, 5)}") // Output: 15

    // Get a function for multiplication
    val multiplyFunction = getOperation("multiply")
    println("Multiplication Result: ${multiplyFunction(10, 5)}") // Output: 50
}

// Higher-order function that returns a function
fun getOperation(operation: String): (Int, Int) -> Int {
    return when (operation) {
        "add" -> { a, b -> a + b }         // Lambda for addition
        "multiply" -> { a, b -> a * b }   // Lambda for multiplication
        else -> { a, b -> 0 }             // Default case
    }
}
