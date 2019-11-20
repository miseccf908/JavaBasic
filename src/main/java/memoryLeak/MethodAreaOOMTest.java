package memoryLeak;

import java.lang.reflect.Method;

public class MethodAreaOOMTest {/*
    public static void main(String[] args) {
        int i=0;
        try {
            while(true){
                Enhancer enhancer = new Enhancer();
                enhancer.setSuperclass(OOMObject.class);
                enhancer.setUseCache(false);
                enhancer.setCallback(new MethodInterceptor() {
                    @Override
                    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                        return proxy.invokeSuper(obj, args);
                    }
                });
                enhancer.create();
                i++;
            }
        } finally{
            System.out.println("运行次数："+i);
        }
    }*/

    static class OOMObject{

    }
}
