package solidSample.DPrinciple;

/****
 *   Created by Feng Chen on 11/5/2019
 */
public class Person {
    //private Bike bike;
    private Car car;
    public Person(){
        //bike = new Bike();
        car = new Car();
    }
    public void goOut(){
        System.out.println("Go out...");
        //bike.drive();
        car.drive();
    }
}
