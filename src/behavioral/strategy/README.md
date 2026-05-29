# Strategy Design Pattern - Payment Processing System

## 📌 Overview

Strategy Design Pattern is a Behavioral Design Pattern used to define a family of algorithms, encapsulate each one, and make them interchangeable at runtime.

This project demonstrates the Strategy Design Pattern using a payment processing system where different payment methods such as Credit Card and UPI can be selected dynamically.

Strategy Pattern is commonly used in:

* Payment Gateways
* Sorting Algorithms
* Authentication Mechanisms
* Travel Route Selection
* Notification Systems

---

## 🚀 Advantages

✅ Runtime Behavior Selection  
✅ Promotes Loose Coupling  
✅ Easy to Extend  
✅ Follows Open/Closed Principle  
✅ Improves Code Maintainability  

---

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Behavioral Design Pattern

---

## 📂 Project Structure

```bash
behavioral/
│
└── strategy/
    ├── Payment.java
    ├── CreditCard.java
    ├── Upi.java
    ├── PaymentStrategy.java
    ├── StrategyMain.java
    └── README.md
````

---

## 📖 Classes Explanation

### 🔹 Payment.java

Strategy interface that defines the payment behavior.

```java id="9gk4p8"
package behavioral.strategy;

public interface Payment {

    void pay(int amount);
}
```

---

### 🔹 CreditCard.java

Concrete strategy implementation for Credit Card payment.

```java id="2m6rgi"
package behavioral.strategy;

public class CreditCard implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println(
            "Paid " + amount + " using Credit Card"
        );
    }
}
```

---

### 🔹 Upi.java

Concrete strategy implementation for UPI payment.

```java id="7b7p4r"
package behavioral.strategy;

public class Upi implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println(
            "Paid " + amount + " using UPI"
        );
    }
}
```

---

### 🔹 PaymentStrategy.java

Context class responsible for executing the selected payment strategy.

```java id="4qlx4w"
package behavioral.strategy;

public class PaymentStrategy {

    private Payment payment;

    public PaymentStrategy(Payment payment){
        this.payment = payment;
    }

    public void makePayment(int amount){
        payment.pay(amount);
    }
}
```

---

### 🔹 StrategyMain.java

Main class used to demonstrate the Strategy Design Pattern.

```java id="10yq9s"
package behavioral.strategy;

public class StrategyMain {

    public static void main(String[] args) {

        PaymentStrategy strategy1 =
                new PaymentStrategy(new CreditCard());

        PaymentStrategy strategy2 =
                new PaymentStrategy(new Upi());

        strategy1.makePayment(100000);

        strategy2.makePayment(75000);
    }
}
```

---

## ▶️ Sample Output

```text id="e86wwj"
Paid 100000 using Credit Card
Paid 75000 using UPI
```

---

## 🔄 Workflow

1. Create payment strategy objects
2. Pass desired payment method to the context class
3. Execute payment dynamically
4. Different payment algorithms are used at runtime

---

## 💡 Real-World Use Cases

* Online Payment Systems
* Payment Gateway Integration
* Navigation Applications
* Authentication Providers
* Discount Calculation Systems

---

## ⚡ Key Features Implemented

✅ Runtime Payment Method Selection
✅ Encapsulation of Payment Algorithms
✅ Loose Coupling
✅ Flexible System Design
✅ Behavioral Design Pattern

---

## 🎯 Why Use Strategy Pattern?

Strategy Pattern is useful when:

* multiple algorithms are available
* behavior must change dynamically
* conditional statements become complex
* algorithms should be interchangeable
* code should remain loosely coupled

---

## 📚 Learning Outcome

This project demonstrates:

* Strategy Design Pattern fundamentals
* Runtime algorithm selection
* Interface-based programming
* Flexible object behavior
* Clean and maintainable Java design

---

## 🧠 UML Representation

```text id="5zqwd2"
                 Payment
                    ^
                    |
         -----------------------
         |                     |
    CreditCard               Upi


              PaymentStrategy
                     |
                     v
                 Payment
```

---

## 👨‍💻 Author

### Pushpendra Singh

GitHub:
https://github.com/pushpendrahub

