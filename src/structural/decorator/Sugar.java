package structural.decorator;

public class Sugar extends CoffeeDecorator{
    
    public Sugar(Coffee coffee){
        super(coffee);
    }

    @Override
    public int cost(){
        return coffee.cost()+20;
    }
}
