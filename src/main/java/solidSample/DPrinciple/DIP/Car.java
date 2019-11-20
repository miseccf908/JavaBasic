package solidSample.DPrinciple.DIP;

/****
 *   Created by Feng Chen on 11/5/2019
 */
public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("By Car!");
    }
}
