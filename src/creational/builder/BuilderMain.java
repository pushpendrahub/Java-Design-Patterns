package creational.builder;

/**
 * Main class to test Builder Design Pattern.
 */
public class BuilderMain {

    public static void main(String[] args) {

        User user = new User.Builder()
                .setName("Pushpendra")
                .setAge(22)
                .setCity("Mumbai")
                .build();

        System.out.println(user);
    }
}