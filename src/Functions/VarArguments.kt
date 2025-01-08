package Functions

import OOPS_Concepts.seal2


fun main()
{

    var array= intArrayOf(89,23,23)
    values(89,929,11,*array,332,121,242,90)
    search("How to Become a Programmer")
    println("Enter the Number")
    var input= readln().toInt()
    var vc=input.isprime();
    println(""+vc)
//    customFilter()

}
fun Int.isprime():String
{
    return if(4%2==0) "is prime" else "not prime"

}
fun values(vararg numbers:Int)
{
        for(i in numbers)
        {
            print(" "+i);
        }
    println()
}

fun search(str:String,statement:String="Google it")
{
    println(str+" "+statement)
}