package test;
//
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import java.util.concurrent.ConcurrentHashMap;
//
//import org.junit.Assert.*;

public class Test1 {
    public static void main(String[] arg) {
        /*int[] a = {1, 2};
        int[] b = a;
        System.out.println("a[1] = " + a[1]);
        b[1] = 5;
        System.out.println("a[1] = " + a[1]);
        System.out.println("a[0] = " + a[0]);*/
        /*String s1="ABC";
        String s2="A"+"BC";
        String s3=new String("A")+ new String ("BC");
        String s4=new String("ABC");
        System.out.println("s1==s2 is "+ (s1 == s2));
        System.out.println("s1==s3 is "+ (s1 == s3));
        System.out.println("s1==s4.intern is "+ (s1 == s4.intern()));
        System.out.println("s4==s4.intern is "+ (s4 == s4.intern()));*/



        /*String a = new String("ab");
        String b = new String("ab");
        String c = "ab";
        String d = "a" + "b";
        String e = "b";
        String f = "a" + e;

        System.out.println(b.intern() == a);
        System.out.println(b.intern() == c);
        System.out.println(b.intern() == d);
        System.out.println(b.intern() == f);
        System.out.println(b.intern() == a.intern());

        StringBuffer g = new StringBuffer("ab");
        StringBuffer h = new StringBuffer("a");
        StringBuffer i = h.append(e);

        System.out.println(g == i);*/
//        ConcurrentHashMap dsd = new ConcurrentHashMap();
//        String str = "abc";
//        String str1 = "abc";
//        String str2 = new String("abc");
//        System.out.println(str == str1);//true
//        System.out.println(str1 == "abc");//true
//        System.out.println(str2 == "abc");//false
//        System.out.println(str1 == str2);//false
//        System.out.println(str1.equals(str2));//true
//        System.out.println(str1 == str2.intern());//true
//        System.out.println(str2 == str2.intern());//false
//        System.out.println(str1.hashCode() == str2.hashCode());//true
//
//        String strN=str1;
//        System.out.println("strN==str1 ? "+ (strN==str1));
        int[] arr = new int[]{1,4,5,-8,102,-7,55,78,34,99,101};
        int  a = Test1.get2ndMaxNum(arr);
        //System.out.println("the 2nd max number is:  "+a);
//        Assert.assertEquals(101,a);
    }

    private static int get2ndMaxNum(int[] arr){
        int[] max2 = new int[2];
        for(int i : arr){
            if(i>=max2[0])
                max2[0] = i;
            else if(i >= max2[1])
                max2[1] = i;
        }


        return max2[1];
    }
}
