package CollectionPrograms.ListModules

fun main(args:Array<String>)
{   //mutablelistof
    var mutablelist= mutableListOf("lenovo","hp",3)
    println(mutablelist)
    println(mutablelist.add("Dell"))
    println("${mutablelist.remove(3)}\n $mutablelist")
    println("${mutablelist.removeAt(2)}\n$mutablelist")
    val hard =!(9!=9)&&true||9>12&&false||3<9
    println(hard)
}