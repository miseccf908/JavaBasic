package excpt;

//import java.lang.ClassLoader;
//import static com.sun.corba.se.impl.util.JDKBridge.loadClass;
//import org.apache.log4j.helpers.Loader.loadClass;

/****
 *   Created by Feng Chen on 10/15/2019
 */
public class ClzNotFoundExpt {

    public static void main(String[] args) {
        try {
            System.out.println("dasdsada");
//            Class.forName()
            //Class.forName("test321.hello1");
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            loader.loadClass("test321.hello1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
