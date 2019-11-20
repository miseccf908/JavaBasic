package algorithmCase.recusion;

import random.RandomInt;

import java.util.Arrays;

public class Combination { //找出一个数组中，任意组合的和是给定值的  任意组合
    static int[] comb=new int[10];
    static int index=0;
    static int resultNo=0;
    static int executeTime =1;
    public static void seakComb(int[] arr, int sum,int start){
        executeTime++;
        //int[] comb={};
        if(sum==0) {
            System.out.println("result no"+(++resultNo)+": "+Arrays.toString(Arrays.copyOfRange(comb,0,index)));
            index--; // this row is very important, that i missed at the beginning.
            return;//actually, i don't think it's necessary for this method. i can remove it and the "index--" upper row.
        }else if(sum>0){
            for(int i=start;i<arr.length;i++) {
                if (sum - arr[i] >= 0) {
                    comb[index++] = arr[i];
                    //System.out.println(Arrays.toString(Arrays.copyOfRange(comb,0,index)));
                    seakComb(arr, sum - arr[i], i + 1);
                } else {
                    break;
                }
            }
        }
        index--;
    }

    //this is the method that i searched from internet.
    public static void numGroup(int[] arr, int start, int length, int sum) {
        if (sum == 0) {
            for (int j = 0; j < index; j++) {
                System.out.print(comb[j]+" ");
            }
            System.out.println();
        }
        else if(sum>0) {
            for (int i = start; i < length; i++) {
                int temp_sum=sum - arr[i];

                if(temp_sum>=0)
                {
                    comb[index++] = arr[i];
                    // System.out.println(index);
                    numGroup(arr, i + 1, length-1, sum - arr[i]);
                }
                else	//因为后面的数比这个大，若此时temp_sum小于0，则后面的数更不满足条件，不用再进行循环
                    break;
            }
        }
        index--;
        //  System.out.println(index);
    }

    public static void main(String[] arg){
        RandomInt randomInt = new RandomInt();
        //int[] arr = {2,3,4,5,6,7,8};//randomInt.getUnrepeatedRandomInt(6,1,15);
        int[] arr = randomInt.getUnrepeatedRandomInt(10,10,50);
        System.out.println("Original array is "+Arrays.toString(arr));
        Combination.seakComb(arr,200,0);
        if(resultNo==0)
            System.out.println("This is no combination for that summary");
        System.out.println("Total execution time :"+ executeTime);
        //Combination.numGroup(arr,0,arr.length,20);
    }
}
