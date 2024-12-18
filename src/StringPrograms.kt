fun main()
{
    //String Programs
    val Str="Lenovo";
    println("String length is "+Str.length);
    //Declaration After Using
    var name:String;
    name="Github";
    println(name);
    //Access
    println(name[2]);
    //changes
    println(Str.toUpperCase());
    println(Str.toLowerCase());
//    compare
    //index in String
    println("Value".indexOf("e"))
    println("Display's");
    //Concatination
    println("William"+" "+"Shakespear");
    println("William".plus(" Edwick"));

//    String Templates/Interpolation using $sign
    println("Your Name is $Str");
    //Substring
    println(Str.substring(2,5));
    val r=89;
    println("Age ${r}");
}
