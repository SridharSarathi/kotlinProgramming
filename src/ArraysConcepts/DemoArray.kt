package ArraysConcepts


fun main()
{
    println("Array with Library function");
    var intarr=intArrayOf(90,343,224,63,343);
    var chararr=charArrayOf('w','d','h','o');
    val longarr=longArrayOf(23232323,42424,243434434L,34353L);
    val boolarr=booleanArrayOf(true,false,true);
    println(boolarr.contentToString());
    println(intarr.contentToString());
    println(chararr.contentToString());
    println(longarr.contentToString());
    //any type of element
    var allarr= arrayOf("Selinum",90,'i',true);
    println(allarr.contentToString());
    //used with generic type
    var allarrwithgeneric= arrayOf<Int>(90,89,3434);

    //Accessing the Array
    var acess =arrayOf<String>("victor","Cyan","william");
    println(acess.get(2));
    println(acess[1]);
    acess.set(1,"Andy");
    println(acess.contentToString());

    println("Empty Array Declartion");
     var emarray=Array(3){};
    println(emarray.contentToString());//{}-without empty close assinging a value in kotlin.unit
    emarray=Array(4){9};
    println(emarray.contentToString());
    var myArray = Array<Int>(5){8}
    println(myArray.contentToString());
    var StrinArray=arrayOf("Vaibhav","Arun","Nothing" );

    for(ele in StrinArray)
    {
        println(ele);
    }

    var fix =arrayOf('9','9','6');
    println(fix[2]);
    //ArrayOf IntArrayOf

    var a:Array <Char> = arrayOf('s','r','i','d','h','a','r');
    for(e in 0..a.size-1)
    {
        print(a[e]);
    }
    var b=intArrayOf(90,343,232,433,98);
    b.forEach{println(it);}
    for(i in b.indices)
    {
        print("${b[i]} ");

    }
    println(b.size);
}