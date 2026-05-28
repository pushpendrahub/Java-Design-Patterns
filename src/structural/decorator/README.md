# Decorator Design Pattern

## 📌 Overview

Decorator Design Pattern is a Structural Design Pattern used to dynamically add new functionality or behavior to an object without modifying its existing code.

It follows the principle of composition over inheritance and allows behavior to be added at runtime.

Decorator Pattern is commonly used in:

* Coffee Ordering Systems
* Pizza Toppings
* Notification Systems
* Java I/O Streams
* UI Component Customization

---

## 🚀 Advantages

✅ Dynamic Behavior Addition
✅ Promotes Flexible Design
✅ Avoids Complex Inheritance
✅ Follows Open/Closed Principle
✅ Enhances Code Reusability

---

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Structural Design Pattern

---

## 📂 Project Structure

```bash
decorator/
│
├── Coffee.java
├── CoffeeDecorator.java
├── SimpleCoffee.java
├── Milk.java
├── Sugar.java
├── DecoratorMain.java
└── README.md
```

---

## 📖 Classes Explanation

### 🔹 Coffee.java

Component interface that defines the common behavior.

```java
package decorator;

public interface Coffee {
    int cost();
}
```

---

### 🔹 CoffeeDecorator.java

Abstract decorator class that implements the `Coffee` interface and holds a reference to a `Coffee` object.

```java
package decorator;

abstract class CoffeeDecorator implements Coffee {

    protected final Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
}
```

---

### 🔹 SimpleCoffee.java

Concrete component representing the base coffee.

```java
package decorator;

public class SimpleCoffee implements Coffee {

    @Override
    public int cost(){
        return 100;
    }
}
```

---

### 🔹 Milk.java

Concrete decorator that adds milk cost to the coffee.

```java
package decorator;

public class Milk extends CoffeeDecorator {

    public Milk(Coffee coffee){
        super(coffee);
    }

    @Override
    public int cost(){
        return coffee.cost() + 10;
    }
}
```

---

### 🔹 Sugar.java

Concrete decorator that adds sugar cost to the coffee.

```java
package decorator;

public class Sugar extends CoffeeDecorator {

    public Sugar(Coffee coffee){
        super(coffee);
    }

    @Override
    public int cost(){
        return coffee.cost() + 20;
    }
}
```

---

### 🔹 DecoratorMain.java

Main class used to demonstrate the Decorator Design Pattern.

```java
package decorator;

public class DecoratorMain {

    public static void main(String[] args){

        Coffee coffee = new SimpleCoffee();

        coffee = new Milk(coffee);

        coffee = new Sugar(coffee);

        System.out.println("Total Coffee Cost: ₹" + coffee.cost());
    }
}
```

---

## ▶️ Sample Output

```text
Total Coffee Cost: ₹130
```

---

## 🔄 Workflow

1. Create a base coffee object
2. Add Milk decorator
3. Add Sugar decorator
4. Each decorator increases the total cost dynamically
5. Final object contains combined behavior

---

## 💡 Real-World Use Cases

* Coffee Customization Systems
* Pizza Topping Applications
* Text Formatting Editors
* Notification Services
* Java Buffered Streams

---

## ⚡ Key Features Implemented

✅ Runtime Behavior Extension
✅ Object Composition
✅ Layered Functionality
✅ Flexible Object Enhancement
✅ Structural Design Pattern

---

## 🎯 Why Use Decorator Pattern?

Decorator Pattern is useful when:

* functionality needs to be added dynamically
* inheritance becomes complex
* behavior should be flexible at runtime
* multiple feature combinations are required

---

## 📚 Learning Outcome

This project demonstrates:

* Decorator Design Pattern fundamentals
* Runtime behavior modification
* Composition over inheritance
* Flexible object enhancement in Java

---

## 🧠 UML Representation

```text
                Coffee
                   ^
                   |
         -------------------
         |                 |
   SimpleCoffee     CoffeeDecorator
                            ^
                            |
                   ----------------
                   |              |
                 Milk           Sugar
```

---

## 👨‍💻 Author

### Pushpendra Singh

GitHub:
https://github.com/pushpendrahub
