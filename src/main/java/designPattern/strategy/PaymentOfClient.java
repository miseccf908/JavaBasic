package designPattern.strategy;

public class PaymentOfClient {
    public static void main(String[] arg){
        //PaymentStrategy paymentStrategy = new WechatPaymentStrategyStrategy("1","1","1","1");
        PaymentStrategy paymentStrategy = new AliPaymentStrategyStrategy("1","1","1","1");
        UserContext userContext = new UserContext(paymentStrategy);
        userContext.pay(100.10f);
    }
}
