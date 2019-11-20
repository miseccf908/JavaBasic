package solidSample.IPrinciple.ISP;

/****
 *   Created by Feng Chen on 11/5/2019
 */
public class Rabbit extends Animal implements run {
    @Override
    void eat() {

    }

    @Override
    void sleep() {

    }

    @Override
    public void move() {
        System.out.println("I run fast");
    }
}
