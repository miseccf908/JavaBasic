package solidSample.DPrinciple.DIP;

/****
 *   Created by Feng Chen on 11/5/2019
 */
public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("By Bike!");
    }
}
