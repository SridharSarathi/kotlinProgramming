package ArraysConcepts


fun main()
{
    var row=8;
    var col=8;
    var arr:Array<Array<String>>;
    arr=Array(row){Array(col){" "} };
    for(i in 1..row-1 step 1)
    {
        for(j in 1..row-1 step 1) {

            if ((i + j)%2== 0)
            {
                arr[i][j]="W";
            }
            else
                arr[i][j]="B";

        }
    }

    for(i in 0..row-1 step 1)
    {
        for(j in 0..row-1 step 1)
        {
            print(arr[i][j]+" ");
        }
        println();
    }


var ass:String =if (10<4) "no" else "yes";

}