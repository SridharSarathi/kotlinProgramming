package Looping

fun main()
{  var a=10;
    while(a<40)
    {

        print("${a} yes ");
        a+=2;
    }
    a=10;
    //nested while
    while(a<20)
    {

        var b=20;
        while(b>10)
        {
            println("a=${a} b=${b} yes");
            b-=2;
        }
        a+=2;
    }

}
