package behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        YoutubeChannel channel=new YoutubeChannel();
        Subscriber pushpendra =new Subscriber("Pushpendra");
        Subscriber aman =new Subscriber("Aman");

        channel.subscribe(aman);
        channel.subscribe(pushpendra);
        channel.notify("Observer Pattern");
        channel.notify("Strategy Pattern");
    }
}
