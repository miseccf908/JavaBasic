package testMethod;

import org.junit.Test;

import java.io.*;
import java.util.*;

/****
 *   Created by Feng Chen on 10/2/2019
 */
public class ArithmeticTestPaper {

    public List<String> getArithmeticPaper(int maxNum, int equationAmt){
        List<String> rtnList = new ArrayList<String>();

        String[] arithmeticSign = new String[]{"+","-"};
//        Random random = new Random();
//        random.nextInt(2);
        for(int i=0;i<equationAmt;i++){
            int num1,num2;
            String sign = arithmeticSign[(new Random()).nextInt(2)];
            if("-".equals(sign)){
                num1 = 5+ (new Random()).nextInt(maxNum-4);// 得到一个[5,10)的随机数
//                while(num1==0){
//                    num1 = (new Random()).nextInt(maxNum+1);
//                }
                num2 = (new Random()).nextInt(num1+1);
//                while (num2>num1) {
//                    num2 = (new Random()).nextInt(maxNum + 1);
//                }

            }else {
                num1 = (new Random()).nextInt(maxNum);
                num2 = (new Random()).nextInt(maxNum);
                while (num1 + num2 > maxNum) {
                    num2 = (new Random()).nextInt(maxNum + 1);
                }
            }
            rtnList.add(num1+" "+sign+" "+num2 +" "+"=" );
        }


        return rtnList;
    }

    private void writeToFile(String fileName, List<String> data) throws IOException {
        File file =new File(fileName);
        Writer out =new FileWriter(file,true);
//        for(String s: data){
//            out.write(s);
//        }
        PrintWriter pw = new PrintWriter(out);

        for(String s: data){
            pw.write(s);
        }
        pw.flush();
        try {
            out.flush();
            pw.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




        out.close();
    }

    public List<String> carryList(){
        List<String> lst = new ArrayList<String>();
        for(int i=2;i<10;i++){
            for(int j=2;j<10;j++){
                if(i+j>10)
                    lst.add(i+" + "+j+" =");
            }
        }
        Collections.shuffle(lst);
//        for(int i=0;i<lst.size();i++){
//            if(i%6 == 0)
//                System.out.println("");
//            System.out.print(lst.get(i) + " =\t\t");
//        }
        return lst;
    }

    @Test
    public List<String> abdication(){
        List<String> lst = new ArrayList<String>();
        for(int i=18;i>10;i--){
            for(int j=9;i-j<10;j--){
                lst.add(i+" - "+j+" =");
            }
        }
        Collections.shuffle(lst);
//        for(int i=0;i<lst.size();i++) {
//            if (i % 6 == 0)
//                System.out.println("");
//            System.out.print(lst.get(i) + " =\t\t");
//        }
        return lst;
    }


    public List<String> ninetyAddition(){
        List<String> lst = new ArrayList<String>();
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                if(i+j<=10)
                    lst.add(i+" + "+j+" =");
            }
        }
        for(int m=10;m>0;m--){
            for(int n=m-1;n>0;n--){
                lst.add(m+" - "+n+" =");
            }
        }
        //System.out.println("Number of eqution: "+ lst.size());
        Collections.shuffle(lst);
        return lst;
//        for(int i=0;i<lst.size();i++){
//            if(i%6 == 0)
//                System.out.println("");
//            System.out.print(lst.get(i) + "\t\t");
//        }
//        System.out.print("\n-------------------------------------------");
    }

    public static void print(List<String> data){
        for(int i=0;i<data.size();i++){
            if(i%6 == 0)
                System.out.println("");
            System.out.print(data.get(i) + "\t\t");
        }
    }

    public static void main(String[] arg){
        ArithmeticTestPaper paper = new ArithmeticTestPaper();
//        List<String> data = paper.getArithmeticPaper(15,50);
//        System.out.println(data);
        for(int i=0;i<10;i++) {
            List<String> data1 = paper.ninetyAddition();
            List<String> data2 = paper.carryList();
            List<String> data3 = paper.abdication();
            print(data1);
            System.out.print("\n-------------------------------------------");
            print(data2);
            System.out.print("\n-------------------------------------------");
            print(data3);
        }
//        try {
//            paper.writeToFile("./1.txt", data);
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}


