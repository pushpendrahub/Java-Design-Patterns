package creational.builder;

/**
 * User class using Builder Design Pattern.
 */
public class User {

    // Immutable fields
    private final String name;
    private final int age;
    private final String city;

    // Private constructor
    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.city = builder.city;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    // toString method
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    /**
     * Static Builder Class
     */
    public static class Builder {

        private String name;
        private int age;
        private String city;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        // Build method
        public User build() {
            return new User(this);
        }
    }
}