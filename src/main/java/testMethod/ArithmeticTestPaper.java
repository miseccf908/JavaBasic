package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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

    private List<String> CarryList(){
        List<String> lst = new ArrayList<String>();
        for(int i=2;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(i+j>10)
                    lst.add(i+" + "+j);
            }
        }
        return lst;
    }


    public static void main(String[] arg){
        ArithmeticTestPaper paper = new ArithmeticTestPaper();
        //List<String> data = paper.getArithmeticPaper(15,50);
//        System.out.println(data);
        List<String> data = paper.CarryList();
        for(int i=0;i<data.size();i++){
            if(i%5 == 0)
                System.out.println("");
            System.out.print(data.get(i) + "\t\t");
        }
        try {
            paper.writeToFile("./1.txt", data);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}


