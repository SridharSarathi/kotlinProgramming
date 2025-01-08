package OOPS_Concepts

class CompanionObject {
    companion object
    {
        fun greet()
        {
            println("This is companion");
        }
        fun create(): String {
            return "calling create method of companion object"
        }
    }
}
fun CompanionObject.Companion.helloWorld() {
    println("executing extension of companion object")
}
fun main()
{
    CompanionObject.helloWorld()
    println(CompanionObject.greet())//without creating a object
}