package jvmStudy;


import java.util.Vector;

public class MemoryLeakDemo {

    public static void main(String[] arg){
        Vector v = new Vector(10);
        for(int i = 0; i <10000; i++) {
            Object o = new Object();
            v.add(o);
            //o = null;
        }

    }
}
