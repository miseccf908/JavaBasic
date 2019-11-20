package solidSample.IPrinciple;

/****
 *   Created by Feng Chen on 11/5/2019
 */
public class ITest {
    public static void main(String[] arg){
        Animal snake = new Snake();
        Animal rabbit = new Rabbit();
        snake.run();
        rabbit.crawl();
    }
}
