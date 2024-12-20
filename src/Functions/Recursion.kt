package Functions
fun main(args: Array<String>)
{

    recursion(12);
    sample(10,'h');
}
fun recursion(v:Int)
{
    var n=1+v;
    println(n);
    if(n==20)
    {
        return;
    }

  recursion(n);
}
//kotlin allow argument intialization in arguments
fun sample(i:Int,intial:Char='C')
{
    println("$i  $intial");
}