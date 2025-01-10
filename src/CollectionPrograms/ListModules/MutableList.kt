package CollectionPrograms.ListModules

fun main(args:Array<String>) {   //mutablelistof
    var mutablelist = mutableListOf("lenovo", "hp", 3)
    var charmutable= mutableListOf("Hp",9,34.2,'E',true)
    println(mutablelist)
    println(mutablelist.add("Asus"))
    println(mutablelist.remove("Asus"))
    println(mutablelist)
    println(mutablelist)
    charmutable.add(90)
    getlist(charmutable)

}
fun getlist(lis:List<Any>)
{

    println("passing the list");
    lis.forEach{println(it)}
}

