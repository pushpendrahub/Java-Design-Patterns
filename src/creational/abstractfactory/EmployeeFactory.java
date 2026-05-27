package creational.abstractfactory;

public class EmployeeFactory {

    public static Employee getEmployee(AbstractFactory factory){
        return factory.createEmployee();
    }
}
