package arrayTest;

//import org.apache.commons.lang.ArrayUtils;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayDemo {
    static String[] stringArr = new String[]{"a","b","c","d","e"};
    static int[] ints = new int[8];
    static int[] intArr={1,2,3,4,5};
    public static void main(String[] arg){
        // print
        /*System.out.println(stringArr);
        System.out.println(intArr);
        System.out.println(Arrays.toString(stringArr));
        System.out.println(Arrays.toString(intArr));*/

        //what class is  the array?
        /*System.out.println("what class i am? :"+stringArr.getClass());
        System.out.println("what superclass i am? :"+stringArr.getClass().getSuperclass());
        System.out.println("constructor of array? :"+stringArr.getClass().getConstructors().length);*/


        //size of Array
        /*System.out.println("length of intArr: "+intArr.length);
        System.out.println("length of ints: "+ints.length);*/

        //what's the class
        /*System.out.println(stringArr.getClass()); // class [Ljava.lang.String;
        System.out.println(stringArr.getClass().getSuperclass()); //class java.lang.Object*/
        //create list
        List list = new ArrayList<String>();
        list = Arrays.asList(stringArr);
        System.out.println(Arrays.toString(list.toArray()));
        List list2=Arrays.asList(intArr);/// the result is List<int[]>. int Array can NOT be convert to List, maybe because the element in array is not OBJECT.
        System.out.println("arraylist is: "+list);
        System.out.println("intArr is "+ Arrays.toString(intArr)+".  arraylist of intArr is: "+list2.toString());
        System.out.println(Arrays.toString(list.toArray()));

        //contains
        //System.out.println("contains '1'? "+Arrays.asList(intArr).contains(1));//false. why?
        /*System.out.println("contains '1'? "+ArrayUtils.contains(intArr,1) );
        System.out.println("contains '1'? "+Arrays.asList(intArr).contains(1));
        System.out.println("contains '1'? "+Arrays.asList(ArrayUtils.toObject(intArr)).contains(1));

        System.out.println("contains 'a'? "+list.contains("a"));
        System.out.println("contains 'a'(using ArrayUtil.contains(0) ? "+ ArrayUtils.contains(stringArr,"a"));//list.contains("a"));
        System.out.println("contains 'f'? "+list.contains("f"));

        //combine 2 arrays.
        String[] arr3 = ArrayUtils.addAll(stringArr,ArrayUtils.toStringArray(ArrayUtils.toObject(intArr)));
        System.out.println(Arrays.toString(arr3));

        //reverse
        ArrayUtils.reverse(stringArr);
        System.out.println(Arrays.toString(stringArr));

        //remove element
        System.out.println(Arrays.toString(ArrayUtils.remove(intArr,4)));
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(ArrayUtils.removeElement(intArr,1)));
        //System.out.println(Arrays.toString(intArr));
        System.out.println(StringUtils.join(stringArr,","));

        //to Set
        stringArr[4]="c";
        HashSet<String> set = new HashSet<>(Arrays.asList(stringArr));
        System.out.println(Arrays.toString(stringArr));
        System.out.println(set);*/

        String[] strings1 = new String[]{"1","2","3","4"};
        String[] strings2 = {"a","b","c","d"};

        System.out.println(Arrays.toString(strings1));

        System.out.println(Arrays.asList(strings2).toString());

        System.out.println("contains a? "+Arrays.asList(strings2).contains("a"));
        System.out.println("contains 2? "+ArrayUtils.contains(strings1,"2"));

        System.out.println(Arrays.toString(ArrayUtils.addAll(strings1,strings2)));
        System.out.println(StringUtils.join(strings2,","));

        List list3 = Arrays.asList(strings1);
        System.out.println(list3.getClass());
        //Arrays.asList 生成的是一个Arrays$ArrayList(class java.util.Arrays$ArrayList)，而不是一个ArrayList，
        // Arrays$ArrayList 和ArrayList都继承自AbstractList这个抽象类，该类自带的add（）和remove()方法 的方法体里只有一句“throw new UnsupportedOperationException();”
        //而ArrayList类override了add()和remove（）方法，才会有真正的add和remove操作。所以用asList时，要转为ArrayList才能进行add和remove操作
        List list4 = new ArrayList(Arrays.asList(strings1));
        System.out.println(list4.getClass());
        System.out.println(Arrays.toString(list4.toArray()));

        list4.add("m");
        list4.add("j");
        list4.add("1");

        Set set= new HashSet<String>(list4);
        System.out.println(set.toString());

        ArrayUtils.reverse(strings2);
        System.out.println(Arrays.toString(strings2));
        //对于数组的remove操作只能生成一个新的数组，而不能改变原数组的元素。
        strings1 = new String[]{"1","2","3","4","3"};
        String[] strings3 = ArrayUtils.remove(strings1,3);
        strings3 =  ArrayUtils.removeElement(strings3,"3");//只能删除第一个出现的“3”
        System.out.println(Arrays.toString(strings3)+", size is "+strings3.length);
    }
}
