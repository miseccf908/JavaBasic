package algorithmCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class HappyStemp {
    public static void main(String[] args) {
        int[] a = {0, 0};
        int[] b = {2, 3};
        List<String> records = new ArrayList<String>();
        walk(a, b, records);
        System.out.println("方法数:" + count);

    }

    public static int count = 0;

    public static void walk(int[] a, int[] b, List<String> records) {
        if (a[0] == b[0] && a[1] == b[1]) {
            count++;
            System.out.print("第" + count + "种方法:  ");
            for (String record : records) {
                System.out.print(" "+record);
            }
            System.out.println();
        } else {

            yWalk(a, b, records);
            xWalk(a, b, records);

        }
    }
    //X轴走
    public static void xWalk(int[] a, int[] b, List<String> records) {
        System.out.println(records.toString());
        int xHave = b[0] - a[0];
        if (xHave == 0) {
            return;
        } else {
            int[] temp = new int[2];
            temp[1] = a[1];
            temp[0] = a[0] + 1;
            walk(temp, b, makeRecords( Arrays.toString(temp), records));
            System.out.println("xwalk out");
            /*if (xHave > 1) {
                temp[0] = a[0] + 2;
                walk(temp, b, makeRecords("X轴走了二步", records));
            }*/
        }
    }
    //y轴走
    public static void yWalk(int[] a, int[] b, List<String> records) {
        System.out.println(records.toString());
        if (b[1] == a[1]) {
            return;
        } else {
            int[] temp = new int[2];
            temp[0] = a[0];
            temp[1] = a[1] + 1;
            walk(temp, b, makeRecords( Arrays.toString(temp), records));
            System.out.println("ywalk out");
        }
    }

    //制作行走记录
    public static List<String> makeRecords(String str, List<String> old) {
        List<String> listNew = new ArrayList<String>();
        listNew.addAll(old);
        if(listNew.size()>0) {
            listNew.add(" -> "+str);
        }else
            listNew.add(str);
        return listNew;
    }
}