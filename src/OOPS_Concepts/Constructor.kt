package OOPS_Concepts

class myClass(name: String, id: Int) {
    val e_name: String
    var e_id: Int
    //need for change the variable values
    init{
        e_name = name.capitalize()
        e_id = id

        println("Name = ${e_name}")
        println("Id = ${e_id}")
    }
}
fun main(args: Array<String>){
    val myclass = myClass ("Ashu", 101)
    val angle=Rectangle(19,23)
    val dog = Dog("Buddy", "Golden Retriever")

}
class Rectangle(a:Int,b:Int)
{
    var size=a*b;
    init{
    println("Area of Rectangle "+size)
    }

}
//supporting inhertance

class Dog(name: String, val breed: String) : Animal(name) {
    init {
        println("Dog created: $name of breed $breed")
    }
}
open class Animal(val name: String)
