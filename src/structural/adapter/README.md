# Adapter Design Pattern

## 📌 Overview

Adapter Design Pattern is a Structural Design Pattern used to allow two incompatible interfaces to work together.

It acts as a bridge between two classes by converting one interface into another interface that the client expects.

The Adapter Pattern is commonly used in:

* Mobile Charger Adapters
* Payment Gateway Integrations
* Legacy System Integration
* Third-Party API Integration
* Power Socket Converters

---

## 🚀 Advantages

✅ Improves Code Reusability
✅ Allows Incompatible Classes to Work Together
✅ Promotes Loose Coupling
✅ Enhances Maintainability
✅ Follows SOLID Principles

---

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Structural Design Pattern

---

## 📂 Project Structure

```bash
adapter/
│
├── Adapter.java
├── AdapterMain.java
├── Android.java
├── Iphone.java
└── README.md
```

---

## 📖 Classes Explanation

### 🔹 Iphone.java

Target interface expected by the client.

```java
package adapter;

public interface Iphone {

    void charge();
}
```

---

### 🔹 Android.java

Adaptee class that provides incompatible functionality.

```java
package adapter;

public class Android {

    public void usb(){
        System.out.println("Charging with USB-C charger");
    }
}
```

---

### 🔹 Adapter.java

Adapter class that converts Android charging into Iphone compatible charging.

```java
package adapter;

public class Adapter implements Iphone {

    private Android android;

    public Adapter(Android android){
        this.android = android;
    }

    @Override
    public void charge(){

        System.out.println("Adapter converts Lightning Port to USB-C");

        android.usb();
    }
}
```

---

### 🔹 AdapterMain.java

Main class used to demonstrate Adapter Design Pattern.

```java
package adapter;

class AdapterMain {

    public static void main(String[] args){

        Android a = new Android();

        Iphone i = new Adapter(a);

        i.charge();
    }
}
```

---

## ▶️ Sample Output

```text
Adapter converts Lightning Port to USB-C
Charging with USB-C charger
```

---

## 🔄 Workflow

1. Client expects `Iphone` interface
2. `Android` class has incompatible method `usb()`
3. `Adapter` implements `Iphone`
4. Adapter internally calls Android's `usb()` method
5. Client can now use Android charger as Iphone charger

---

## 💡 Real-World Use Cases

* Mobile Charging Adapters
* Laptop Docking Stations
* Audio Jack Converters
* Payment Service Wrappers
* Legacy Software Integration

---

## ⚡ Key Features Implemented

✅ Interface Conversion
✅ Object Composition
✅ Loose Coupling
✅ Reusable Design
✅ Structural Pattern Implementation

---

## 🎯 Why Use Adapter Pattern?

Adapter Pattern is useful when:

* existing classes are incompatible
* code modification is not possible
* integration with third-party libraries is required
* backward compatibility is needed

---

## 📚 Learning Outcome

This project demonstrates:

* Adapter Design Pattern fundamentals
* Interface-based programming
* Object Composition
* Structural Design Patterns in Java
* Real-world interface adaptation

---

## 👨‍💻 Author

### Pushpendra Singh

GitHub:
https://github.com/pushpendrahub
