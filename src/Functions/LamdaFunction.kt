package Function
 data class choclate( var name:String, var price:Int)

fun main(){
     var mylamda={a:Int-> a+89; }
    println(mylamda(10));//99
   var candy= listOf(
       choclate("Cadbury",100),
       choclate("Munch",20),
       choclate("milky Bar",80)
      );
    var result=candy.maxBy { choclate-> choclate.price}
    println(result);

println("Lamda");
    var greet={" Hello Java"};
    println(greet());
    println("Single Parameter Lamda");
   var spl={a:Int->a*a}
    println(spl(7));

    println("Two Parameter Lamda");
    var tpl={a:Int,b:Int->a*b};
    println(tpl(8,9));

    println("Lamda with Function Arguement ");
   val res =calculate(5,6){x,y->x*y};
    println(res);

    println("lamda funcion with fraction  in function without argument");
    var fracvalue=fraction(){d,c->d+c};
    println(fracvalue);

    println("Lambda with Type Inference");
    var value={a:Int->a*10};
    println(value(8))

    println("Lambda with it (Implicit Name)");
    var lit={it :Int ->it* 5}
    println(lit(4));

println("Lambda as a Return Value");

    val double = getMultiplier(2)
   // println(double(50))  // Output: 10
//    fun getMultiplier(factor: Int): (Int) -> Int {
//        return { x: Int -> x * factor }
//    }

}
//lamda function for lamda with functional argument
fun calculate(v1:Int, v2:Int,operation:(Int,Int)->Int):Int
{
 return operation(v1,v2);
}
fun fraction(fractionCalculate:(Int,Float)->Float):Float
{
    return fractionCalculate(12,9.89F);
}
fun getMultiplier(factor: Int): (Int) -> Int {
    return { x: Int -> x * factor }
}