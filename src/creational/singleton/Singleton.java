package creational.singleton;

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstace(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

}
