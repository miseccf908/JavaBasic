package memoryLeak;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ConstantPoolOOMTest {
    /**
     * VM Args:-XX:PermSize=10m -XX:MaxPermSize=10m
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i=1;
        try {
            while(true){
                String uuid = UUID.randomUUID().toString();
                System.out.println(uuid);
                list.add(uuid.intern());
                i++;
            }
        } finally {
            System.out.println("运行次数："+i);
        }
    }
}
