package sort;

import java.lang.reflect.Array;
import java.util.Arrays;
//快速排序算法
public class QuickSort implements Sorter {
    @Override
    public void sort(String[] strings) {
        quickSort(strings,0,strings.length-1);
    }

    @Override
    public void sort(int[] a) {
        quickSort(a,0,a.length-1);
        //System.out.println("change time is "+changeTime);

    }

    public void quickSort(String[] strings, int low, int high){
        int l = low;
        int h = high;
        String str = strings[l];
        while(l<h){
            while (l<h && strings[h].compareTo(str)>=0){
                h--;
            }
            if(l<h) {
                String temp = "";
                temp = strings[h];
                strings[h] = strings[l];
                strings[l] = temp;
                l++;
            }

            while(l<h&&strings[l].compareTo(str)<=0)
                l++;

            if(l<h){
                String temp = "";
                temp = strings[h];
                strings[h] = strings[l];
                strings[l] = temp;
            }
        }

        System.out.println(Arrays.toString(strings));

        if(l>low)
            quickSort(strings,low,l-1);
        if(h<high)
            quickSort(strings,l+1,high);
    }
    //private static int changeTime=0;
    public int qSort(int[] arr, int l, int h){

        int a = arr[l];
        while(l<h) {

            while (l < h && arr[h] > a) {
                h--;
            }
            arr[l] = arr[h];
            System.out.println(Arrays.toString(arr) + "l: "+l +" h: "+h );
            //changeTime++;
            while (l < h && arr[l] <= a) {
                l++;
            }
            arr[h] = arr[l];
            System.out.println(Arrays.toString(arr) + "l: "+l +" h: "+h );
            //changeTime++;
        }
        arr[h] = a;
        System.out.println(Arrays.toString(arr) + "l: "+l +" h: "+h );
        return h;
    }
    private static int i = 1;
    private void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pivot=qSort(arr, low, high);        //将数组分为两部分

            System.out.println("Round "+i++ +": "+Arrays.toString(arr));
            quickSort(arr, low, pivot-1);                   //递归排序左子数组
            quickSort(arr, pivot+1, high);                  //递归排序右子数组
        }
    }
}
