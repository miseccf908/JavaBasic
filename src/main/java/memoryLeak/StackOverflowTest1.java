package memoryLeak;

public class StackOverflowTest1 {
    static int depth=0;
    public void stackOFMethod(){
        depth++;
        stackOFMethod();
    }
    public static void main(String[] arg){
        StackOverflowTest1 stackOverflowTest1 = new StackOverflowTest1();
        try{
            stackOverflowTest1.stackOFMethod();
        }finally {
            System.out.println("recusion times: "+depth);
        }
    }
}
