package CollectionPrograms.ListModules

import java.util.ArrayList

fun main(args:Array<String>)

{
    var al= ArrayList<Any>();
    println(al.size)
    al.add("Sakthi")
    al.add(90)
    al.add("Guna")
    al.add(32)
    al.add("Sasi")
    println(al);
    var al2:ArrayList<String> = ArrayList<String>()
    al2.add("10")
    al2.add("89")
    al2.add("Scan")
    al2.add("main")

    var itr=al2.iterator()
    while(itr.hasNext())
        print(" "+itr.next())
    println()
    al2.set(2,"Spring")
    println(al2)
    println(al.indexOf(90))
    println(al.lastIndexOf("90"))
    println("${al}\n${al.remove(90)}\n${al}")
    println(al.clear())
    println(al)
    //arrayListO
    var alo = arrayListOf<Any>(3,33,23,234,"Selinium")
    for(i in alo)
        println(i)
}
