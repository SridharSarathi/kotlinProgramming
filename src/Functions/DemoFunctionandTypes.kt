package Functions
fun main()
{
    println(ParameterWithReturn(10,9.87F));
    parameterOnlyNoreturn(9090,23424);
    print(NoparameterWithRetrun());
    NoparameterNoRetrun();

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
    print("No Return no parameter");
}