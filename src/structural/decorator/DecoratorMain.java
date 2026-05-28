package decorator;

public class DecoratorMain {
    public static void main(String []args){
        Coffee coffee=new SimpleCoffee();
        coffee=new Milk(coffee);
        coffee=new Sugar(coffee);

        System.out.println("Total Coffee Cost: ₹" + coffee.cost());
    }
}
