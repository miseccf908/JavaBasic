package java8features.lambdaExp;

import java.util.Arrays;
import java.util.List;

/****
 *   Created by Feng Chen on 9/30/2019
 */
public class TestLambda {

    public static void main(String[] arg){
        List<String> Strings = Arrays.asList("a","b","c","d","e");

        System.out.println("before java 8: ");
        for(String s : Strings){
            System.out.println(s);
        }

        System.out.println("Lambda: ");
        Strings.forEach(s-> System.out.println(s));

        Strings.forEach(System.out::println);
    }

   /* private int sum(int[] ints){

    }*/

}
