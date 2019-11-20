package designPattern.singleton;

/****
 *   Created by Feng Chen on 11/6/2019
 */
public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy(){}

    //synchronized is needed for  thread safety
    public static synchronized SingletonLazy getInstance(){
        if(instance == null)
            instance = new SingletonLazy();
        return instance;
    }
}
