package solidSample.DPrinciple.DIP;

/****
 *   Created by Feng Chen on 11/5/2019
 *
 *
 *
 *   High-level modules should not depend on low-level modules. Both should depend on abstractions.
 *
 *   Abstractions should not depend on details. Details should depend on abstractions.
 */
public class Person {
    private Vehicle vehicle;
    public Person(Vehicle v){
        vehicle = v;
    }
    public void goOut(){
        System.out.println("Go out!");
        vehicle.drive();
    }
}
