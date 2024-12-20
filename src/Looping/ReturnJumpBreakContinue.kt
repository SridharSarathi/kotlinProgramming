package Looping


fun main() {
//println("break statement");
//    for(i in 1 until 11 )
//    {
//        if(i==7)
//        {
//            println(" i is ${i}  so, I am stop the loop");
//        }
//    }
//    //labled loops
//    for(i in 5..55 step 10)
//    {
//        for(j in 10..50 step 10)
//        {
//            if(j==30)
//            {
//                break;
//            }
//            println(" i=${i} j=${j}");
//        }
//    }
//    println("\n Labled Loop");
//    abc@ for(i in 5..55 step 10)
//    {
//        for(j in 10..50 step 10)
//        {
//            if(j==30)
//            {
//                break@abc;
//            }
//            println(" i=${i} j=${j}");
//        }
//    }
//
//    for(i in 1 until 11 step 1)
//    {
//        for(j in 1 until 11 step 1 )
//        {   if(j==7)
//            break;
//            print(" "+j);
//        }
//        println();
//    }
//    println("  ")
//    breaker@  for(i in 1 until 11 step 1)
//    {
//        for(j in 1 until 11 step 1 )
//        {
//            if(j==7)
//                break@breaker;
//            print(" "+j);
//        }
//        println();
//    }
    println("Continue code");
    for(i in 1 until 11 step 1)
    {
        if(i==7)
            continue;
        print(i);
    }
    println();
   labe@ for(i in 1 until 11 step 2)
    {
        for(j in 1 until 11 step 1)
        {
        if(j==7)
            continue@labe;
            print("$j ");
        }

    }


}

