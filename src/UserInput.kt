import java.util.Scanner;
fun main(args: Array<String>)
{
    //USING READLINE()
//    println("Enter the name");
//    var str= readln();
//    println("Enter the integer");
//    var i= readln();//get values in String
//    var j= readln();
//    println(i+j);
//    println(i.toInt()+j.toInt());
    println("Enter the Character");
    var m:Char=readln()!![0];
    var c=m.toInt();
    println("Enter Integer");
    var In=Integer.valueOf(readln());
    println("Enter Float");
    var fl= readln().toFloat();
    println("Enter Double");
    var dou= readln().toDouble();
    println("Enter Long");
    var lo= readln().toLong();
    println("Enter Short");
    var sh=readln().toShort();
    println("Integer ${In}\n float ${fl}\n short ${sh}\n double ${dou}\n Long${lo}\n");

    //USING SCANNER CLASS

    //creating Scanner class object
     var scn=Scanner(System.`in`);
    println("Enter the Character");
    var sc=scn.next()!![0];
    println("Enter Integer");
    var sIn=scn.nextInt();
    println("Enter Float");
    var sfl= scn.nextFloat();
    println("Enter Double");
    var sdou=scn.nextDouble();
    println("Enter Long");
    var slo=scn.nextLong();
    println("Enter Short");
    var ssh=scn.nextShort();
    println("Enter Boolean True or False ");
    var sboo=scn.nextBoolean();
    println("Enter Byte -128 to 127");
    var sby=scn.nextByte();
    println("Character ${sc}\n Integer ${sIn}\n float ${sfl}\n short ${ssh}\n double ${sdou}\n Long${slo}\n");

    print(10.toString()+89.toString());




}