fun main()
{   //Int to Float
    var x=90809800;
    var c=x.toFloat();
    println(c);
    //char to String
    var C='s';
    var s=C.toString();
    //String to Char
    var str=77;
    var ch=str.toChar();
    println(ch+"--")
    var ss:Char='S';
     var cs=ss.toInt();
    println(cs);

//    byte--boolean--char--short--int--float--double--long
    //methods
//    toString()
//    toChar()
//    toByte()
//    toLong()
//    toShort()
//    toDouble()
//    toFloat()
//    toInt()
    val numbers: String = "123"
    val numbersAsInt = numbers.toInt() // Same as: Integer.parseInt(numbers)
    println(numbersAsInt) // prints "123"
    var y='4';
    println(y.digitToInt());
    //Characters
    var char='5';
    println(Character.getNumericValue(char));




}