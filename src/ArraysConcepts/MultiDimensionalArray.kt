package ArraysConcepts

fun main() {
    //Declaring 2D Array
    var matric = arrayOf(arrayOf(3, 4, 3),
                         arrayOf(8, 6, 53.0),
                         arrayOf(89, 3453, 343))
//    println(matric.contentToString());


    //using ArrayConstructor
//    var arrayname=Array(size){Array(size){Default value} }
    var conmatric=Array(3){ Array(4){0} }
//    println(conmatric.contentToString());

    //printing Element
    for(i in matric.indices)
    {
        for(j in matric.indices)
        {
            print("${matric[i][j]} ");
        }
        println()
    }
    //Acessing Element
    println("Accessing element 2nd row 3rd column "+ matric[2][2]);
    matric[0][2]=89 as Nothing
    println("Assining element 1st row 3rd column "+ matric[1][2]);

    for(i in matric.indices)
    {
        for(j in matric.indices)
        {
            print("${matric[i][j]} ");
        }
        println()
    }

}