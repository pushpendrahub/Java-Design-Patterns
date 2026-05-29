package behavioral.observer;

public class Subscriber implements Observer{

    private String name;

    @Override
    public void notified(String title) {
        System.out.println("Hello "+this.name+" new videos uploaded "+title);
    }

    public Subscriber(String name){
        this.name=name;
    }
}
