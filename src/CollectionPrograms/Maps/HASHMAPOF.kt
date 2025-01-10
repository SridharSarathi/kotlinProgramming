package CollectionPrograms.Maps

fun main()
{
    //hashmapOf extended from HashMap
    var hmo:HashMap<Int,Float> = hashMapOf<Int,Float>();
    hmo.put(1,90.3F)
    hmo.put(2,20.3F)
    hmo.put(3,30.3F)
    hmo.put(4,40.3F)
    hmo.put(5,420.3F)

    println(hmo)
    val stringMap: HashMap<String,String> = hashMapOf<String,String>()
    stringMap.put("name", "Ashu")
    stringMap.put("city", "Delhi")
    stringMap.put("department", "Development")
    stringMap.put("hobby", "Playing")
    println("......traverse stringMap.......")
    for(key in stringMap.keys){
        println("Key = ${key} , value = ${stringMap[key]}")
    }
    println(stringMap.containsKey("name"))
    println(stringMap.containsValue("Mumbai"))
    //  REPLACE
    hmo.replace(3,67.6F)
    println(hmo)
    //Size
    println(hmo.size)
    println(hmo.remove(2))
    println("$hmo ${hmo.clear()}")

    println(hmo)
}
