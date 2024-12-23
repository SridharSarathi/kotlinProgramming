package OOPS_Concepts
fun main()
{    println("Single Level inheritance");
    var obj=child();
    obj.say()
    println("");
    println( add(2,7));
    println("Multilevel Inheritance ");
    var D= dog()
    D.sound();
    }


fun add(s:Int,t:Int)=s+t;
open class parent
{
   open fun say()
    {
        println("Don't play outside Running");
    }
}
class child():parent()
{
  override  fun say()
    {
        println("I am not playing");
    }
}
open class animal
{
    open fun sound()
    {
        println("shout");
    }
}
class dog:animal()
{
  override  fun sound()
    {
        println("Dog is Barking")
    }
}
class bird{
    fun sound()
    {
        println("Bird is whistling");
    }
}

