package designPattern.strategy;

public class AliPaymentStrategyStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public AliPaymentStrategyStrategy(String name, String cardNumber, String cvv, String dateOfExpiry ){
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(float amt) {
        System.out.println("pay using ali, amount:"+amt);
    }
}
