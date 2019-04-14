import java.util.Random;
import java.lang.Math;

public class Main {

    public static void randomTest()
    {
        Random r1=new Random(1);
        System.out.println(r1.nextInt(10));

    }

    public static void mathTest()
    {
        int a=-1;
        int b=Math.abs(a);
        System.out.println(b);
    }

    public static void stringTest()
    {
        String s1=new String("123456");
        char a=s1.charAt(4);
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        randomTest();
        mathTest();
        stringTest();
    }
}
