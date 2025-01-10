package CollectionPrograms.Maps

import jdk.internal.net.http.common.Pair.pair

//map
fun main()
{   //Declaration in map
    var map:Map<Int,String> = mapOf<Int,String>(1 to "Sridhar",2 to "Sarathi",3 to "lenovo" );
    val myMap: Map<Int,String> = mapOf<Int, String>(1 to "Ajay", 4 to "Vijay", 3 to "Prakash")

    println(map)
    println("Keys-> "+map.keys)
    println("Values-> "+map.values)

    for(i in map.keys)
        println(map[i])

    //map without generics
    var map2=mapOf(1 to 'A',2 to 'B',3 to 'C')
    println(map2)
    //GET VALUE
    println(map2.getValue(1))
    //RETURN TRUE OR FALSE
    println(map2.containsKey(8))
    //RETURN TRUE OR FALSE
    println(map2.containsValue('3'))
    //GET VALUES BASE ON KEY
    println(map.get(1))
    println(map.getOrDefault(8,"sri"))
    for(itr in myMap.asIterable()){
        println("key = ${itr.key} value = ${itr.value}")
    }
    for(Itr in myMap.iterator())
    {
        println("key = ${Itr.key} value = ${Itr.value}")

    }
    //NOT ADD IN MAP JUST PRINTING PLUS METHOD
        for (i in map.plus(Pair(4,"Rangan"))) {
        println("Element at key ${i.key} = ${i.value}")
    }
    println(map)
    //MINUS METHOD
    for(j in map.minus(2))
    {
        println("keys = ${j.key} at values = ${j.value}")
    }
}