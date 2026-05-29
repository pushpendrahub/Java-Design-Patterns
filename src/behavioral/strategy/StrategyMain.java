package behavioral.strategy;

public class StrategyMain {
    public static void main(String[] args) {

        PaymentStrategy strategy1=new PaymentStrategy(new CreditCard());
        PaymentStrategy strategy2=new PaymentStrategy(new Upi());

        strategy1.makePayment(100000);
        strategy2.makePayment(75000);
    }
}
