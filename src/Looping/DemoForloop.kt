package Looping
fun main(){

    for(i in 1..10 step 3)
    {
        println(i);
    }
//    Nested For
    var arr= arrayOf(222,213,202,155,224)
    for(i in 0 until arr.size)
    {
        for(j in i until arr.size)
        {
            if(arr[i]>arr[j])
            {
                var a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;
            }
        }

    }
    println(arr.contentToString());
    for(i in 2 until 11)
    {
        print("${i} ");
    }
    println();
    for(i in 0 until 15 step 2)
    {
        print("${i} ");
    }
    println();
    for(i in 10 downTo -1 step 2)
    {
        print("${i} ");
    }
//Reverse printng
    var m=10;
    for(i in m  until -1 step 2)
    {
            print(i);
    }
}