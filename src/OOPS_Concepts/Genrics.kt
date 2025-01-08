package OOPS_Concepts
class Students<T>(par:T){
  var par:T=par
    init{
        println(par)
    }
}
fun main()
{
     var s1=Students("89")
    var s2=Students(90)
    val ageInt: Students<Int> = Students(30)
    var sr:Students<Float> = Students(09.2F)

}