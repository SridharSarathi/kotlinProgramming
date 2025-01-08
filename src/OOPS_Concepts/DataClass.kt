package OOPS_Concepts
 data class DataClass(val name:String,val age:Int){

     override fun toString(): String {
         return "[Name= $name Age= $age]";
     }
}
fun main(args:Array<String>)
{
   val dc=DataClass("Raju",90);
    val dc2=DataClass("Sam",33);
    val dc3=DataClass("kevin",20);
    println(dc);
    println(dc==dc3)
    println(dc3.equals(dc2))

}