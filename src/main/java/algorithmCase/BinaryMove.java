package algorithmCase;

import java.util.HashMap;
import java.util.HashSet;

public class BinaryMove {
    public static void main(String[] args) {
        int number = -1;
        //原始数二进制
        printInfo(number);
        number = number << 1;
        //左移一位
        printInfo(number);
        number = number >> 3;
        //右移一位
        printInfo(number);

        number = number >>> 1;
        //无符号右移一位
        printInfo(number);
        HashMap h = new HashMap();
        h.put(1,"rere");
        h.put(2,"eww");

        String s = new String();
        HashSet hashSet=new HashSet();
        System.out.println(h);

    }

    /**
     * 输出一个int的二进制数
     * @param num
     */
    private static void printInfo(int num){
        System.out.print(num+"  :  ");
        System.out.println(Integer.toBinaryString(num));
    }
}
