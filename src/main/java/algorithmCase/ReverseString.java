package algorithmCase;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString {

    int i=0;

    public char[] reverStr(char[] c,int i){
        //int len=c.length;
        //int i =0;
        if(i>c.length/2){
            return c;
        }else{
            reverStr(c,i+1);
            char temp=c[i];
            c[i]=c[c.length-1-i];
            c[c.length-1-i]=temp;
            //i++;
        }
        System.out.println(Arrays.toString(c));
        return c;
    }

    public static void main(String arg[]){
        ReverseString reverseString = new ReverseString();
        reverseString.reverStr(new char[]{'a', 'b', 'c' ,'d', 'e'},0);
        System.out.println(reverseString("123456789"));

    }


    public static String reverseString(String s){
        if(s.isEmpty()) return s;
        String rev= reverseString(s.substring(1))+s.charAt(0);
        return rev;
    }
/*
    public static void main(String[] args) {
        System.out.println(reverseString("123456789"));
    }*/
}
