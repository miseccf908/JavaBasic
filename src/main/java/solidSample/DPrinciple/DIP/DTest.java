package solidSample.DPrinciple.DIP;

/****
 *   Created by Feng Chen on 11/5/2019
 */
public class DTest {

    public static void main(String[] args) {
        Person person1 = new Person(new Bike());
        person1.goOut();

        Person person2 = new Person(new Car());
        person2.goOut();
    }
}