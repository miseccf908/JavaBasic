package algorithmCase.recusion;

import random.RandomInt;

import java.util.Arrays;

public class SumRecusion {
    public int sumMethod(int a,int[] arr){
        int sum=0;
        if(arr.length == 1)
            return a+arr[0];
        else
            sum=sumMethod(a+arr[0], Arrays.copyOfRange(arr,1,arr.length));
        return sum;
    }

    public int sumMethod1(int[] arr){
        if(arr == null || arr.length==0)
            return 0;
        return sumMethod(0,arr);
    }

    public int sumMethod2(int[] arr){
        int len;
        if((len=arr.length)==0)
            return 0;
        else
            return sumMethod2(getArrExceptLast(arr)) + arr[len - 1];
    }

    public static void main(String[] arg){
        SumRecusion sumRecusion= new SumRecusion();
        RandomInt randomInt = new RandomInt();
        int[] arr = randomInt.getRandomInt(5,0,100);
        System.out.println(Arrays.toString(arr));
        System.out.println("sum of arr using sumMethod1 is "+sumRecusion.sumMethod1(arr));
        System.out.println("sum of arr using sumMethod2 is "+sumRecusion.sumMethod2(arr));
    }

    public int[] getArrExceptLast(int[] arr){
        int[] rtn = new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            rtn[i]=arr[i];
        }
        return rtn;
    }
}
