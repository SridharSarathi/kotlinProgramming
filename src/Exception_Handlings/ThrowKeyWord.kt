package Exception_Handlings

fun main(args:Array<String>)
{   try{
    validate(15)
    println("code after validation check...")
}
catch (E:ArithmeticException)
{
    println("Handled Exception in catch block");
}
}
fun validate(age: Int)  {
    if (age < 18)
        throw ArithmeticException("under age")
    else
        println("eligible for drive")
}