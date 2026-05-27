package creational.abstractfactory;

/**
 * Main class to test Abstract Factory Pattern.
 */
public class AbstractFactoryMain{

    public static void main(String[] args) {

        // Android Developer Object
        AbstractFactory androidFactory =
                new AndroidDeveloperFactory();

        Employee androidDeveloper =
                EmployeeFactory.getEmployee(androidFactory);

        System.out.println(androidDeveloper.name());
        System.out.println(androidDeveloper.salary());

        System.out.println("--------------------------------");

        // Java Developer Object
        AbstractFactory javaFactory =
                new JavaDeveloperFactory();

        Employee javaDeveloper =
                EmployeeFactory.getEmployee(javaFactory);

        System.out.println(javaDeveloper.name());
        System.out.println(javaDeveloper.salary());
    }
}