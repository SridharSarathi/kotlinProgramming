package javaKotlincalling

class KotlinReceiver
{
    fun area(a:Int,b:Int):Int
    {   println("Received Kotlin");
        return a*b;
    }
}
var twoparamlamda={i:Int,j:Int->i+j
//    i*j
}
fun main()
{
    var nu=null;
    println(twoparamlamda(
    7,8))
}
