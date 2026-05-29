package behavioral.observer;

public interface Subject {

    public void subscribe(Observer ob);
    public void unSubscribe(Observer ob);
    public void notify(String title);
}
