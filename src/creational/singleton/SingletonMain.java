package creational.singleton;

public class SingletonMain {

    public static void main(String[] args) {

        Singleton db1 = Singleton.getInstance();
        Singleton db2 = Singleton.getInstance();

        System.out.println("Hashcode of db1 : " + db1.hashCode());
        System.out.println("Hashcode of db2 : " + db2.hashCode());
    }
}