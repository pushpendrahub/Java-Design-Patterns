package behavioral.strategy;

public class CreditCard implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using Credit Card");
    }
}
