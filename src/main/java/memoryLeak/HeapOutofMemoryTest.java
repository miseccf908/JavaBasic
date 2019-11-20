package memoryLeak;

import java.util.ArrayList;
import java.util.List;

public class HeapOutofMemoryTest {
    public static void main(String[] arg){
        List<byte[]> list = new ArrayList<>();
        int i=0;
        while (true){
            list.add(new byte[10*1024*1024]);
            System.out.println("list size: "+list.size());
        }
    }
}
