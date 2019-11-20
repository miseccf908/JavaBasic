package memoryLeak;

public class StackOverFlowTest2 {

    //OS will die if run the process.
    /*public static void main(String[] args) {
        StackOverFlowTest2 test = new StackOverFlowTest2();
        test.oomMethod();
    }*/

    public void oomMethod(){
        while(true){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    loopMethod();
                }
            }).start();;
        }
    }

    private void loopMethod(){
        while(true){

        }
    }
}
