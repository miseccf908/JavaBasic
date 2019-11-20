package sort;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Arrays;

public class BubbleSortTest extends TestCase {

    Sorter sorter= new BubbleSort();
    public void testSort() {
        String[] strings = {"a","g","a","r","d"};
        sorter.sort(strings);
        Assert.assertArrayEquals(new String[]{"a","a","d","g","r"},strings);
        //System.out.println(Arrays.toString(strings));
    }

    public void testSort1() {
        int[] ints = new int[]{1,2,8,7,5};
        sorter.sort(ints);

        System.out.println(Arrays.toString(ints));
    }
}