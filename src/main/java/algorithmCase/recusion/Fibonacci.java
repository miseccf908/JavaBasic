package algorithmCase.recusion;

public class Fibonacci {
    public static int getNvalue(int n){
        if(n<=0)
            return 0;
        else if(n==1||n==2)
            return 1;
        else{
            return getNvalue(n-1)+getNvalue(n-2);
        }
    }

    public static void main(String[] arg){
        for(int i=0;i<10;i++) {
            System.out.println("第" +i+"个数是: "+Fibonacci.getNvalue(i));
        }
    }
}
