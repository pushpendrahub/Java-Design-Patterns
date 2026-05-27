package creational.abstractfactory;

public class JavaDeveloperFactory extends AbstractFactory{
    @Override
    public Employee createEmployee() {
        return new JavaDeveloper();
    }
}
