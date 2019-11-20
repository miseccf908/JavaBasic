package algorithmCase.recusion;

import java.util.*;

public class WgtComb {
    public Set<Integer> randomInt(int min, int max, int num){
        Set<Integer> ret=new HashSet<>();
        //String[] arr= new String[5];
        //List<String> list = new ArrayList();
        if(num<=0)
            return null;
        //for(int i=0;i<num;i++){
        //int i=0;
        int count=0;
        while (ret.size()<num) {
            int a = (int) (Math.random() * (max - min)) + min;
            ret.add(a);
            System.out.println("this is the random time: "+ ++count + ", a is "+a);
            //i++;
        }
        return ret;
    }

    public static void main(String[] arg){
        WgtComb wgtComb= new WgtComb();
        Set r = wgtComb.randomInt(0,10,6);
        System.out.println(r== null? "Empty Set" : r.toString());
    }
}
