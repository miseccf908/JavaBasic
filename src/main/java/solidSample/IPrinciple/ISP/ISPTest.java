package solidSample.IPrinciple.ISP;


/****
 *   Created by Feng Chen on 11/5/2019
 *
 *  The interface-segregation principle (ISP) states that no client should be forced to depend on methods it does not use.
 *
 *  sometimes when implements the interface, there is method that is useless for the implementation class,
 *  so it's better to divide he interface to several ones for loose coupling
 *  and easy to modify and re-construct
 *
 *  advantage:
 *  1 loose coupling
 *  2 easy to modify
 *
 */
public class ISPTest {
    public static void main(String[] arg){
        Animal rabbit = new Rabbit();
        Animal snake = new Snake();
        ((Snake) snake).move();
        ((Rabbit) rabbit).move();
    }
}
