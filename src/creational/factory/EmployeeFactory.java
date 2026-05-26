package creational.factory;

public class EmployeeFactory {

    public static Employee getEmployee(String type){
        if(type.equalsIgnoreCase("AndroidDeveloper")){
            return new AndroidDeveloper();
        } else if (type.equalsIgnoreCase("JavaDeveloper")) {
            return new JavaDeveloper();
        }
        return null;
    }
}
