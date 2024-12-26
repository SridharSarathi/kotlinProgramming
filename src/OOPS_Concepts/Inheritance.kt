package OOPS_Concepts
fun main()
{    println("Single Level inheritance");
    var obj=child();
    obj.say()
    println("Multilevel Inheritance ");
    var D= dog()
    var b=bird();
    D.sound();
    b.sound();

    println("Hierachical Inheritance ");
    var t=Tamil()
    t.Song();
    var k=kerala();
    k.Song();
    }

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
open class dog:animal()
{
  override  fun sound()
    {
        println("Dog is Barking")
    }
}
class bird:dog(){
    override fun sound()
    {
        println("Bird is whistling");
    }
}

open class India
{
   open fun Song()
    {
        println("India is Our Country");
    }
}
class Tamil:India()
{

}
class kerala:India()
{
    override fun Song()
    {
        println("This is Kerala");
    }
}
class Karnadaka :India()
{
    override fun Song()
    {
        println("This is Karnataka");
    }
}