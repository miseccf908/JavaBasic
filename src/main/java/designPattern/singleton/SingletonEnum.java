package designPattern.singleton;

/****
 *   Created by Feng Chen on 11/8/2019
 */
public enum SingletonEnum {
    INSTANCE;
    private SingletonEnum(){
        System.out.println("this is instance of singleton");
    }
}
