package creational.abstractfactory;

public class AndroidDeveloperFactory extends AbstractFactory{
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
