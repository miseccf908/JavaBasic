package solidSample.LPrinciple;

/****
 *   Created by Feng Chen on 11/5/2019
 *
 *      Liskov substitution Principle
 *   objects of a superclass shall be replaceable with objects of its subclasses without breaking the application
 *   That requires the objects of your subclasses to behave in the same way as the objects of your superclass
 *   it is reasonable that there is no impact when subclass replaces baseclass anywhere of the application
 *
 *   why need LSP?
 *   1 inherit should be a 'is-a' relationship
 *   2 subclass should be used without any error
 *   3 will not increase complexity
 */
public class LTest {
    public void resize(Rectangle r){
        while (r.getHeight()<=r.getWidth()){
            r.setHeight(r.getHeight()+1);
            System.out.println("Width: "+ r.getWidth() + ", Height: "+r.getHeight());
        }

    }
    public static void main(String[] arg){
        LTest lTest = new LTest();
        Rectangle r = new Rectangle(4l,3l);
        lTest.resize(r);
        System.out.println("Rectangle ---- Width: "+ r.getWidth() + ", Height: "+r.getHeight());
        Square s = new Square(4l,2l);
        lTest.resize(s);
        System.out.println("Rectangle ---- Width: "+ s.getWidth() + ", Height: "+s.getHeight());
    }
}
