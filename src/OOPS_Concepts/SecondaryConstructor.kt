package OOPS_Concepts

fun main()
{
    var ch=Function("LENOVO",10)
}
class Function{
   var name:String
    var age:Int
    constructor(name:String,age:Int)
    {
        this.name=name;
        this.age=age;
        println("I AM THE SECONDARY CONSTRUCTOR ${name},${age}");

    }
}
