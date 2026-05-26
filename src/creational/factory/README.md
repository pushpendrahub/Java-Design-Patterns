# Factory Design Pattern

## 📌 Overview

Factory Design Pattern is a Creational Design Pattern used to create objects without exposing the object creation logic to the client.

Instead of directly creating objects using the `new` keyword, the client requests objects from a factory class. The factory class decides which object to create and return.

This pattern helps in achieving loose coupling and improves code maintainability.

---

## 🚀 Advantages

✅ Promotes Loose Coupling  
✅ Centralized Object Creation  
✅ Improves Code Maintainability  
✅ Easy to Extend with New Classes  
✅ Follows SOLID Principles  

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)

---

## 📂 Project Structure

```bash
factory/
│
├── Employee.java
├── AndroidDeveloper.java
├── JavaDeveloper.java
├── EmployeeFactory.java
└── FactoryPatternDemo.java
```

---

## 📖 Classes Explanation

### 🔹 Employee.java

Common interface implemented by all employee types.

```java
public interface Employee {
    int salary();
    String role();
}
```

---

### 🔹 JavaDeveloper.java

Concrete implementation representing Java Developers.

```java
public class JavaDeveloper implements Employee {
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String role() {
        return "Java Developer";
    }
}
```

---

### 🔹 AndroidDeveloper.java

Concrete implementation representing Android Developers.

```java
public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        return 40000;
    }

    @Override
    public String role() {
        return "Android Developer";
    }
}
```

---

### 🔹 EmployeeFactory.java

Factory class responsible for object creation.

```java
public class EmployeeFactory {

    public static Employee getEmployee(String type) {

        if(type.equalsIgnoreCase("JAVA")) {
            return new JavaDeveloper();

        } else if(type.equalsIgnoreCase("ANDROID")) {
            return new AndroidDeveloper();
        }

        return null;
    }
}
```

---

### 🔹 FactoryPatternDemo.java

Main class used to test the Factory Design Pattern.

```java
public class FactoryPatternDemo {

    public static void main(String[] args) {

        Employee javaDeveloper =
                EmployeeFactory.getEmployee("JAVA");

        System.out.println(
                javaDeveloper.role()
        );

        Employee androidDeveloper =
                EmployeeFactory.getEmployee("ANDROID");

        System.out.println(
                androidDeveloper.role()
        );
    }
}
```

---

## ▶️ Sample Output

```text
Role : Java Developer
Salary : 50000

--------------------------------

Role : Android Developer
Salary : 40000
```

---

## 🔄 Workflow

1. Client requests object from factory
2. Factory checks requested type
3. Factory creates appropriate object
4. Object returned to client
5. Client uses object without knowing creation logic

---

## 💡 Real-World Use Cases

- Notification Services
- Database Connection Factories
- Logger Frameworks
- Payment Gateway Systems
- UI Component Creation

---

## 🎯 Key Learning

The Factory Pattern hides object creation logic and provides a clean way to create objects dynamically.

It is one of the most commonly used Creational Design Patterns in Java applications and enterprise-level systems.

---

## 👨‍💻 Author

### Pushpendra Singh

GitHub:
https://github.com/pushpendrahub
