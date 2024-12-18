fun main() {
    //String Programs
    val Str = "Lenovo";
    println("String length is " + Str.length);
    //Declaration After Using
    var name: String;
    name = "Github";
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
    println("William" + " " + "Shakespear");
    println("William".plus(" Edwick"));
    println("Vikings".plus(" Come from").plus(" North"));

//    String Templates/Interpolation using $sign
    println("Your Name is $Str");
    //Substring
    println(Str.substring(2, 5));
    val r = 89;
    println("Age ${r}");

    var cv = "Accessable".toByteArray();
    println(cv.contentToString());
    //Squences of String
    var S1 = "Programs".subSequence(0, 2);
    println(S1);
    println(S1.count());
// Split()
    var sp="Mango,Apple,Orange,Banana";
    println(sp.split(","));
    //Replace
    println("Hello Bro".replace("Bro","World"))
    println("Benene".replaceAfter("e","s")); //values Changed after e
    println("     Alphapetics      ".trim());

}
