package creational.singleton;

public class SingletonMain {
    public static void main(String[] args){
        Singleton db1= Singleton.getInstace();
        Singleton db2= Singleton.getInstace();

        System.out.println(db1.hashCode());
        System.out.println(db2.hashCode());
    }
}
