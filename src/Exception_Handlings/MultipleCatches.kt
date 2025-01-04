package Exception_Handlings
fun main()
{
    try{
        var a=909/0;
        var arr= intArrayOf(7,8,3)
        arr.set(3,56);
    }
    catch (e:ArithmeticException)
    {
        println("Arithemertic Exception Handled")
    }
    catch(e:NumberFormatException)
    {
        println("NumberFormatException Handled")
    }
    catch(w:IndexOutOfBoundsException)
    {
        println("IndexOutOfBoundException  handled");
    }
}