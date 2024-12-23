package OOPS_Concepts

class NestedInnerClass {
    fun moon()
    {
        println("its shining");
    }
    class inner{
        var a=10;
        fun sun(c:String)
        {
            println("its brighting"+c);
        }
// Called when the Inner class instance is created
    init {
    sun("inner class call")
}


    }

}
fun main()
{
        var nic=NestedInnerClass()
    nic.moon();
    val iner = NestedInnerClass.inner()
    iner.sun("");
}