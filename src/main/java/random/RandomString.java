package random;

import java.util.Random;

public class RandomString {
    static String keyString= "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public String[] getRandomString(int arrLen,int maxStringLen){
        String[] rdStrArr=new String[arrLen];
        Random r = new Random();

        for(int j=0;j<arrLen;j++) {
            StringBuffer sb = new StringBuffer();
            int len=r.nextInt(maxStringLen)+1;
            for (int i = 0; i < len; i++) {
                int idx = r.nextInt(keyString.length());
                sb.append(keyString.charAt(idx));
            }
            rdStrArr[j]=sb.toString();
        }
        return rdStrArr;
    }
}
