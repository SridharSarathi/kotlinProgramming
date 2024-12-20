package Functions
fun main()
{
    println(ParameterWithReturn(10,9.87F));
    parameterOnlyNoreturn(9090,23424);
    print(NoparameterWithRetrun());
    NoparameterNoRetrun();
    println(vote(9));

}
fun ParameterWithReturn(i:Int,S:Float):Float
{
  var a=i+S;
    return a;
}
fun parameterOnlyNoreturn(a:Int,b:Int)
{
    println(a+b);
}
fun NoparameterWithRetrun():String
{
    return " With Return no parameter\n";
}
fun NoparameterNoRetrun()
{
    println("No Return no parameter");
}
//Function as expression
fun vote(a:Int)=if(a>18) "adult" else "kid";