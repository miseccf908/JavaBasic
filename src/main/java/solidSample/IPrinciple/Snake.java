package solidSample.IPrinciple;

/****
 *   Created by Feng Chen on 11/5/2019
 */
public class Snake implements Animal {
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void run() {
        System.out.println("I can not run");
    }

    @Override
    public void crawl() {
        System.out.println("crawl crawl crawl");
    }
}
