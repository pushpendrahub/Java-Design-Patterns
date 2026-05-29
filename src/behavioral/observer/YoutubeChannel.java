package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    List<Observer> subscribers=new ArrayList<>();


    @Override
    public void subscribe(Observer ob) {
        this.subscribers.add(ob);
    }

    @Override
    public void unSubscribe(Observer ob) {
        this.subscribers.remove(ob);

    }

    @Override
    public void notify(String title) {

        for(Observer ob:this.subscribers){
            ob.notified(title);
        }
    }
}
