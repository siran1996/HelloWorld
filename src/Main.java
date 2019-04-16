import java.util.*;
import java.lang.Math;

public class Main {

    private static void randomTest()
    {
        Random r1=new Random(1);
        System.out.println(r1.nextInt(10));

    }

    private static void mathTest()
    {
        int a=-1;
        int b=Math.abs(a);
        System.out.println(b);
    }

    private static void stringTest()
    {
        String s1= "123456";
        char a=s1.charAt(4);
        System.out.println(a);
    }

    private static void listTest()
    {
        List<String> l= new ArrayList<>();
        l.add("abc");
        l.add("123");
//        Iterable i= (Iterable) l.iterator();
        for (String s:l
             ) {
            System.out.println(s);
        }
    }

    private static void setTest()
    {
        Set<String> s=new HashSet<>();
        s.add("abc");
        s.add("123");
        s.add("123");
        for (String i:s
             ) {
            System.out.println(i);
        }
    }

    private static void mapTest()
    {
        Map<Integer,String> m=new HashMap<>();
        m.put(0,"abc");
        m.put(1,"123");
        for (Map.Entry entry:m.entrySet()
             ) {
            System.out.println("key="+entry.getKey()+" value="+entry.getValue());

        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        randomTest();
        mathTest();
        stringTest();
        listTest();
        setTest();
        mapTest();
    }
}
