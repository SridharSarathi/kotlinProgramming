package CollectionPrograms.Maps
fun main()
{
val mutable= mutableMapOf<String,String>()
    mutable.put("name", "Ashu")
    mutable.put("city", "Delhi")
    mutable.put("department", "Development")
    mutable.put("hobby", "Playing")
    mutable.put("age", "23")
    mutable.put("fruit", "lemon")
    mutable.put("food", "chicken")

    println(mutable)
    val hashMap: HashMap<String,String> = hashMapOf<String,String>()
    hashMap.putAll(mutable)
    var itr=hashMap.iterator()
    while(itr.hasNext()){
        println(itr.next())
        }
    mutable.remove("city")

   println("$mutable \n${mutable.clear()} \n$mutable" )
}