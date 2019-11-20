package sort;


import java.util.Arrays;

public class BubbleSort implements Sorter{

    @Override
    public void sort(String[] strings) {
        //首先了解冒泡排序的思路，每次是相邻两个值进行比较。和选择排序不一样，选择排序是拿一个值和后面的每个值进行比较。
        //第二，在循环的写法上，首先确定外层循环的次数，是length-1次，也就是从第一个元素循环到倒数第二个元素。
        //                   内层循环次数是递减的，第一次是length-1， 第二次是length-2....依次类推。
        //                  循环次数一定不能写错，否则极容易出现下标越界。
        String temp="";
        for(int i=0;i<strings.length;i++){
            for(int j=0;j<strings.length-i-1;j++){
                if(strings[j].compareTo(strings[j+1])>0){
                    temp=strings[j];
                    strings[j]=strings[j+1];
                    strings[j+1]=temp;
                    //SwapVar.swapString(strings[j],strings[j+1]);

                }
            }
        }

    }

    @Override
    public void sort(int[] a) {
        //int cnt=0;
        int temp;
        //while(cnt<a.length) {]
        //int j=a.length;
        //while (j<=a.length && j>0 ) {

        for(int j=0;j<a.length-1;j++){
            //System.out.print("第" + (a.length-j) + "轮：");
            for (int i = 0; i <a.length-j-1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                    //SwapVar.swapInt(a[i],a[i+1]);
                }
            }
            //j--;
            System.out.println(Arrays.toString(a));
        }


        //}
    }
}
