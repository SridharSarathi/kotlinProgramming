package OOPS_Concepts
fun main()
{

var A=Aliens()
    A.Think()
    var p=people()
  println(p.Deposit())
}
abstract class Human
{
    abstract fun Think()

}
class Aliens:Human()
{
    override fun Think()
    {
        println("We are Aliens");
    }

}
abstract class Bank
{
    abstract fun Deposit():Double
}
class people:Bank()
{
    override fun Deposit():Double
    {
        return 9.89+90;
    }
}