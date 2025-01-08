package OOPS_Concepts

class ExtensionFunction
{
    fun percentage(num:Int):Float{

        return num/100.toFloat()*100;
    }
}
fun ExtensionFunction.greet():String
{
    return "Good";
}
fun main(args:Array<String>)
{
    var exm=ExtensionFunction();
    var vls= exm.percentage(44);
    println(vls);
    println(exm.greet());

}