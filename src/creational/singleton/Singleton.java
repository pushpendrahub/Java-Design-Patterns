package creational.singleton;

public class Singleton {

    // Single static instance
    private static Singleton instance;

    // Private constructor
    private Singleton() {
    }

    // Public method to provide object access
    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}