package javaKotlincalling;


public class JavaCalller {
    public static void main(String args[])
    {
        KotlinReceiver kr=new KotlinReceiver();
        int var= kr.area(8,3);
        System.out.println(var);
    }

}
