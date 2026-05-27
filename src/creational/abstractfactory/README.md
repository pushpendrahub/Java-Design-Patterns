# Abstract Factory Design Pattern

## 📌 Overview

Abstract Factory Design Pattern is a Creational Design Pattern used to create families of related objects without specifying their concrete classes.

It provides an interface for creating objects, while the actual object creation is handled by concrete factory classes.

This pattern helps achieve:
- Loose Coupling
- Scalability
- Better Code Organization
- Separation of Object Creation Logic

---

## 🚀 Advantages

✅ Promotes Loose Coupling  
✅ Centralized Object Creation  
✅ Easy to Extend  
✅ Improves Code Maintainability  
✅ Follows SOLID Principles  
✅ Supports Scalability

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)

---

## 📂 Project Structure

```bash
abstractfactory/
│
├── AbstractFactory.java
├── Employee.java
├── AndroidDeveloper.java
├── JavaDeveloper.java
├── AndroidDeveloperFactory.java
├── JavaDeveloperFactory.java
├── EmployeeFactory.java
├── AbstractFactoryMain.java
└── README.md
```

---

## 📖 Classes Explanation

### 🔹 Employee.java

Common interface implemented by all employee types.

```java
public interface Employee {

    int salary();

    String name();
}
```

---

### 🔹 AbstractFactory.java

Abstract factory class responsible for employee object creation.

```java
public abstract class AbstractFactory {

    public abstract Employee createEmployee();
}
```

---

### 🔹 AndroidDeveloper.java

Concrete implementation representing Android Developers.

```java
public class AndroidDeveloper implements Employee {

    @Override
    public int salary() {
        return 100000;
    }

    @Override
    public String name() {
        return "Android Developer";
    }
}
```

---

### 🔹 JavaDeveloper.java

Concrete implementation representing Java Developers.

```java
public class JavaDeveloper implements Employee {

    @Override
    public int salary() {
        return 150000;
    }

    @Override
    public String name() {
        return "Java Developer";
    }
}
```

---

### 🔹 AndroidDeveloperFactory.java

Factory class responsible for creating Android Developer objects.

```java
public class AndroidDeveloperFactory extends AbstractFactory {

    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
```

---

### 🔹 JavaDeveloperFactory.java

Factory class responsible for creating Java Developer objects.

```java
public class JavaDeveloperFactory extends AbstractFactory {

    @Override
    public Employee createEmployee() {
        return new JavaDeveloper();
    }
}
```

---

### 🔹 EmployeeFactory.java

Factory producer class used to get employee objects using factories.

```java
public class EmployeeFactory {

    public static Employee getEmployee(AbstractFactory factory) {
        return factory.createEmployee();
    }
}
```

---

### 🔹 AbstractFactoryMain.java

Main class used to test the Abstract Factory Design Pattern.

```java
public class AbstractFactoryMain {

    public static void main(String[] args) {

        AndroidDeveloperFactory androidDeveloperFactory =
                new AndroidDeveloperFactory();

        Employee emp1 =
                EmployeeFactory.getEmployee(androidDeveloperFactory);

        System.out.println(emp1.name());
        System.out.println(emp1.salary());

        JavaDeveloperFactory javaDeveloperFactory =
                new JavaDeveloperFactory();

        Employee emp2 =
                EmployeeFactory.getEmployee(javaDeveloperFactory);

        System.out.println(emp2.name());
        System.out.println(emp2.salary());
    }
}
```

---

## ▶️ Sample Output

```text
Android Developer
100000

Java Developer
150000
```

---

## 🔄 Workflow

1. Client requests a factory
2. Factory creates related object
3. Object returned to client
4. Client uses object without knowing implementation details

---

## 💡 Real-World Use Cases

- UI Component Libraries
- Database Drivers
- Payment Gateway Integration
- Notification Systems
- Cross-Platform Applications

---

## 🎯 Difference Between Factory & Abstract Factory

| Factory Pattern | Abstract Factory Pattern |
|----------------|--------------------------|
| Creates objects | Creates factories |
| Single factory class | Multiple factory classes |
| Simpler | More scalable |
| One product family | Multiple related product families |

---

## ⚡ Key Features Implemented

✅ Interface-based Design  
✅ Factory Abstraction  
✅ Loose Coupling  
✅ Dynamic Object Creation  
✅ Clean Architecture

---

## 📚 Learning Outcome

This project demonstrates:
- Abstract Factory Pattern fundamentals
- Object creation abstraction
- Factory hierarchy implementation
- Clean coding practices in Java

---

## 👨‍💻 Author

### Pushpendra Singh

GitHub:
https://github.com/pushpendrahub