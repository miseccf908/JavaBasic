package solidSample.SPrinciple;

import javafx.beans.binding.ObjectExpression;

import java.lang.reflect.Executable;

/****
 *   Created by Feng Chen on 10/22/2019
 *
 *  S ----- Single Responsibility Principle (SRP)
 *  A class should have a single responsiblity , or have only one job.
 *
 *  advantage:
 *  1. testable
 *  2. easy to modify, easy to maintain
 *
 */
public class OrderProcessor {
/*

    public float calculatePrice(Object order){
        //calculate price for whole order
        return 1.0f;
    }

    public void saveOrderToDB(Object order){
        //save order to database
    }
*/

    public static void main(Object order){
      /*  OrderProcessor o = new OrderProcessor();
        try{
            o.calculatePrice(order);
            o.saveOrderToDB(order);
        }catch (Exception e){
            e.printStackTrace();
        }
*/
        CalcOrder c = new CalcOrder();
        OrderDao dao = new OrderDao();
        try{
            c.calcOrder( order);
            dao.saveOrder(order);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
