package `Control Flow`

fun main() {

    //when statement

    println("Enter the value");
    var v= readln()!![0];
     when(v)
     {
        '1'->println(" value is ${v}");
        '2'->println(" value is ${v}");
        '3'->println(" value is ${v}");
        '4'->println(" value is ${v}");
         else->println("nothing");


     }
         //when is using in double dot operator  ..
    println("Enter the value");
    var M= readln()!![0];
    when(M)
    {
        in '1'..'5' ->println(" value is ${M}");
       in '6'..'9'->println(" value is ${M}");


        else->println("nothing");


    }
    var number = 7
    when(number) {
        in 1..5 -> println("Input is provided in the range 1 to 5")
        in 6..10 -> println("Input is provided in the range 6 to 10")
        else -> println("none of the above")
    }
}