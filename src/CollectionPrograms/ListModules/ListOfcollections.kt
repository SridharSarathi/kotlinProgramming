package CollectionPrograms.ListModules

//listof()--read only,size fixed
fun main()
{
    val lis= listOf(12,34,234,1243)
    val lis2= listOf("a",'s',90.9F,"String",90)
    var list = listOf(1,2,3,"Ajay","Vijay","Prakash")//read only, fix-size
    for(i in lis) {
        println(i)
    }
    var stringList: List<String> = listOf<String>("Ajay","Vijay","Prakash","Vijay","Rohan")

    for(ele in lis2)
    {
      println("$ele ")
    }
    for(elem in 0..list.size-1)
    {
       print("${list[elem]},")
    }
    println()
    println("Get index "+stringList.get(0))
    println(stringList.indexOf("Vijay"))
    println(stringList.lastIndexOf("Vijay"))
    println(stringList.size)
    println(stringList.contains("Prakash"))
    println(stringList.containsAll(list))
    println(stringList.subList(2,4))
    println(stringList.isEmpty())
    println(stringList.drop(1))
    println(stringList.dropLast(2))
//    println(stringList.removeAt(1))
}