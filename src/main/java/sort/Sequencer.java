package sort;

import random.RandomInt;
import random.RandomString;

import java.util.Arrays;

public class Sequencer {

    public static void main(String[] arg){
        Sequencer sequencer = new Sequencer();
        sequencer.intSequancer();

        sequencer.stringSequancer();
    }

    public void intSequancer(){
        RandomInt randomInt = new RandomInt();
        int[] a = randomInt.getRandomInt(10,25,1000);
        System.out.println("Before sort---------- "+ Arrays.toString(a));
        //Sorter sorter= new SelectSort();
        //Sorter sorter= new QuickSort();
        Sorter sorter= new BubbleSort();
        sorter.sort(a);
        System.out.println("After sort---------- "+Arrays.toString(a));
    }

    public void stringSequancer(){
        RandomString randomString = new RandomString();
        String[] s = randomString.getRandomString(10,7);
        System.out.println("Before sort---------- "+ Arrays.toString(s));
        //Sorter sorter= new QuickSort();
        Sorter sorter= new BubbleSort();
        sorter.sort(s);
        System.out.println("After sort---------- "+Arrays.toString(s));
    }
}

