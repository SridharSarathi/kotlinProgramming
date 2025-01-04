package Exception_Handlings

fun main(args:Array<String>) {
    try {
        var a = 10
        var b = 0
        var c = 10 / 0
        println(c)
    } catch (e: ArithmeticException) {
        e.printStackTrace();
        println("cannot divisible by Zero");
    } finally {
        println("block stop")
    }
  println( exceptionReturn("19"))
println(getNumber("10.0"))
}
//Return a exception in method
fun exceptionReturn(v:String):Int
{
    return try{
            Integer.parseInt(v)
    }

    catch(E:Exception)
    {
        0;
    }
}
fun getNumber(str: String): Number {
    return try {
        // Try parsing as an integer first
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        try {
            // If that fails, try parsing as a double
            str.toDouble()
        } catch (e: NumberFormatException) {
            0 // Return 0 if neither parsing works
        }
    }
}


