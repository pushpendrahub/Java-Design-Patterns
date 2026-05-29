package structural.decorator;

public class Milk extends CoffeeDecorator{

    public Milk(Coffee coffee){
        super(coffee);
    }

    @Override
    public int cost() {
        return coffee.cost()+10;
    }
}