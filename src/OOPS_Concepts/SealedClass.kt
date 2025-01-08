package OOPS_Concepts

sealed  class SealedClass

class seal1:SealedClass()
class seal2:SealedClass()


fun main(args:Array<String>)
{ var c:SealedClass=seal1()
    when(c)
    {   is seal1 -> println("Seal 1")
         is  seal2-> println("Seal 2")
         else-> println("Not work");
    }
}