package Functions
fun main()
{//higher order function
      var goal=say(::greet);
      println(goal);

        println("Higher-Order Function Taking Another Function as a Parameter");
        var add= Arithemeticoperation(5,8){ x, y -> x+y}
        var sub=Arithemeticoperation(5,8){x,y -> x-y}
                //method(param,param){ par1,par3->opration(+,/,-,*)}
                                      //lamda
            println(" adding performance using operation "+add)
            println(" adding performance using operation "+sub)
println("Higher-Order Function Returning Another Function ");
    val multiplyBy2 = createMultiplier(2)
    println("   Higher order Function Return value  "+multiplyBy2(5));



}
fun say(saying:()->String ):String
{  return saying();  }

fun greet():String="thanks";

//package Functions
//
//fun main() {
//    val goal = say(10, ::greet)  // Pass `10` as the Int argument and `::greet` as the function reference.
//    println(goal)
//}
//
//fun say(a: Int, saying: () -> String): String {  // Return type corrected to `String`
//    return saying()  // Call the passed function and return its result
//}
//
//fun greet(): String = "thanks"


//1. Higher-Order Function Taking Another Function as a Parameter

fun Arithemeticoperation(a:Int,b:Int,addition:(Int,Int)->Int):Int
{
        return addition(a,b);
}
//2.Higher-Order Function Returning Another Function
fun createMultiplier(multiplier: Int): (Int) -> Int {

    return { number -> number * multiplier }
}