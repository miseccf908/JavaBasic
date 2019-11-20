package designPattern.singleton;

/****
 *   Created by Feng Chen on 11/8/2019
 */
public class SingletonInnerClz {
    private SingletonInnerClz(){}

    public static SingletonInnerClz getInstance(){
        return Holder.singletonInnerClz;
    }

    private static final class Holder{
        private static SingletonInnerClz singletonInnerClz = new SingletonInnerClz();
    }
}
