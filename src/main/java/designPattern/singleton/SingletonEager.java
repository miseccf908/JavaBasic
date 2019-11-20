package designPattern.singleton;

/****
 *   Created by Feng Chen on 11/6/2019
 */
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();
    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return instance;
    }
}
