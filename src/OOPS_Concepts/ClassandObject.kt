package OOPS_Concepts

class ClassandObject
{
    var a=10;
    fun add(ad:Int)
    {
        a+=ad;
        println("balance "+a)
    }
    fun depo(dp:Int)
    {
        a-=dp;
        println("Balance "+a);
    }
}
fun main()
{
//    object Creation
    var v=ClassandObject();
    println(v.a);
    v.add(10);
    v.depo(4)
}