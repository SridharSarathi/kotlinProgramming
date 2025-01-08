package javaKotlincalling;
import java.util.*;

public class Sample {
    public static void main(String[] args) {
        max();
        JavaGetterAndSetter jas=new JavaGetterAndSetter();
        jas.setAge(89);
        System.out.println(jas.getAge());
    }
    public static int arrayaccess(int ar[])
    { int a=0;
        for(int i=0;i<ar.length;i++)
        {
            a+=ar[i];
        }
        System.out.println(Arrays.toString(ar));
        return a;
    }
    public static void saying()
    {
        System.out.println("Kotlin class calling and i here in java class");
    }
    public static int max()
    {
        int ar[]={67,23,534,343,34};
        int max=ar[0];
        for(int i=0;i<ar.length;i++)
        {
                if(ar[i]>max)
                {
                    max=ar[i];
                }
        }
        System.out.println(max);
        return max;
    }

    }


