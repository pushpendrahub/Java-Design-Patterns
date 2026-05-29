package behavioral.strategy;

public class PaymentStrategy {

    private Payment payment;

    public PaymentStrategy(Payment payment){
        this.payment=payment;
    }

    public void makePayment(int amount){
        payment.pay(amount);
    }
}
