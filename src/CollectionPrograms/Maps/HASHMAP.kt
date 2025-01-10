package CollectionPrograms.Maps

fun main()
{
    //DECLARATION EMPTY,INTIALSTATE,
    var hasmap=HashMap<Int,String>()
    var hasmap2=HashMap<Int,String>(2)

    hasmap.put(1,"MS")
    hasmap.put(2,"Word")
    hasmap.put(5,"Outlook")
    hasmap.put(3,"Excel")
    hasmap.put(4,"Power Point")


    println(hasmap)

    hasmap2.put(4,"A")
    hasmap2.put(1,"Ajay")
    hasmap2.put(3,"Vijay")
    hasmap2.put(2,"Rohan")
    for( i in hasmap2)
    {
        println("Key -> ${i.key} Values ->${i.value}")
    }
    println(hasmap.containsValue("A"))
    println(hasmap.containsKey(2))
    println(hasmap2.remove(2))
    println(hasmap2)
}
