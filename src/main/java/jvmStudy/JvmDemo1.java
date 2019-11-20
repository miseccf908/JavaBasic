package jvmStudy;

public class JvmDemo1 {

    private static int counter = 0;

    public void testRecursive() {
        System.out.println("Thred : " + Thread.currentThread().getName() + " execute " + counter++);
        if (counter == 2000) {
            try {
                Thread.sleep(1000 * 60);
            } catch (Exception e) {
            }
        }
        testRecursive();
    }

    public static void main(String[] arg){
        //int outMem= 1234567890;
       JvmDemo1 demol = new JvmDemo1();
       demol.testRecursive();
    }
}
