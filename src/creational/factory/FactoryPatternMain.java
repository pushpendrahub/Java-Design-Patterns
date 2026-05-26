package creational.factory;

public class FactoryPatternMain {
    public static void main(String[] args) {
        Employee emp = EmployeeFactory.getEmployee("androiddeveloper");
        System.out.println(emp.salary());

        Employee emp1 = EmployeeFactory.getEmployee("javadeveloper");
        System.out.println(emp1.salary());
    }
}
