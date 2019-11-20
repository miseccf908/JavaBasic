package designPattern.strategy;

public class UserContext {
    private PaymentStrategy paymentStrategy;
    public UserContext(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(float amt){
        paymentStrategy.pay(amt);
    }
}
