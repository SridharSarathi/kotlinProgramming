fun main()
{
    //"Arithmetric"
    println("Arithemetric Operator");
    var d=43;
    println(5+9);
    println(4-9);
    println(12*6);
    println(32/3);
    println(43%2);
    println(d++);
    println(d--);
    println(++d);
    println(--d);
    //
    println("Assingment Operator");
    //Assingment Operator
    var a=8;
    a+=9;println(a);
    a-=5;println(a);
    a/=3;println(a);
    a*=4;println(a);
    a%=2;println(a);

    //Logical Operator
    var b=89;
    println(99>b&&b<89);
    println(99>b||b<89);
    var bool=false;
    println(!bool);

    //comparison Operator
    println("Comparison Operator");
    val p=23;val m=88;
    println('p'+a);
    println('m'+b);
    println("23 equals to 88 "+(p==m));
    println("23 not equal 88 "+(p!=m));
    println("23 less than or equal 88 "+(p<=m));
    println("23 greater than or equal 88 "+(p>=m));
    println("23 less than or equal 88 "+(p>m));
    println("23 greater tha 88 "+(p>m));

    //bitwise OR
    println(12 or 33);
//  0000 1100
//  0010 0001
//  -----------
//  0010 1101   --45
    println(34 and 78);
   /*
            0010 0010
            0100 1110
            ---------
            0000 0010  --2
   * */
    println(7 xor 4);
    /*
        0111
        0100
        ----
        0011  -3
    */
    //inv()--methods
    println(35.inv());
//    00100011
//    ________
//    11011100  = 220 (In decimal)
//    left shift operator
    println(3 shl 1);
//    0011
//    0110 --6
    println(87 shr 5);
//    0000 0010  -2
    println(10 ushr 2);
//    0101    1010
//       0010
//double dot operator
    println(1..5);
//-> Arrow operator
//    ->  its allows separate diffrent block of code
    var Arrow=1;
    when(Arrow)
    {
       1-> println(Arrow);
    }
}

