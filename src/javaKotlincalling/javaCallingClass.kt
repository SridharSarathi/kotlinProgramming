package javaKotlincalling
import javaKotlincalling.Sample

import Functions.sample

//import javaKotlincalling.Sample
class javaCallingClass {
}
fun main(args:Array<String>)
{
    var obj=JavaGetterAndSetter()
var call= Sample.max()
    println(call)
    Sample.saying()
    obj.setAge(23)
    println(obj.getAge())
    println("java Access kotlin Properties");

    var intarr= intArrayOf(23,343,232,45,334,544,)
    var valer= Sample.arrayaccess(intarr)
//    val valer = Sample.arrayaccess(intarr)
    println(valer)

}