package creational.abstractfactory;

public class JavaDeveloper implements Employee{

    @Override
    public int salary() {
        return 150000;
    }

    @Override
    public String name() {
        return "Java Developer";
    }
}
