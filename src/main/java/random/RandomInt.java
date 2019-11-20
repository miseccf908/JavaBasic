package random;

//import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;


public class RandomInt {
    public int[] getRandomInt(int arrLen,int min,int max){
        int[] a = new int[arrLen];
        for(int i=0;i<arrLen;i++){
            a[i] = min + (int)(Math.random()*(max-min));
        }
        return a;
    }

    public static int[] getUnrepeatedRandomInt(int arrLen,int min,int max){
        int[] a = new int[arrLen];
        Set s=new HashSet<Integer>();
        //for(int i=0;s.size()<=arrLen;i++){
        while(s.size()<arrLen){
            //a[i] = min + (int)(Math.random()*(max-min));
            s.add(min + (int)(Math.random()*(max-min)));
        }

        int i=0;
        for(Object o:s){
            a[i]=((Integer)(o)).intValue();
            i++;
        }
        return a;
    }
}
