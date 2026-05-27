# Builder Design Pattern

## 📌 Overview

Builder Design Pattern is a Creational Design Pattern used to construct complex objects step-by-step.

It helps create immutable and readable objects without using multiple constructors. The Builder Pattern is especially useful when an object contains many optional parameters.

Instead of passing all values through a constructor, the object is built using method chaining.

---

## 🚀 Advantages

✅ Improves Code Readability  
✅ Avoids Telescoping Constructors  
✅ Supports Immutable Objects  
✅ Easy Object Creation  
✅ Better Maintainability  
✅ Flexible and Scalable Design

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)

---

## 📂 Project Structure

```bash
builder/
│
├── User.java
├── BuilderMain.java
└── README.md
```

---

## 📖 Classes Explanation

### 🔹 User.java

Represents the main User object with immutable fields.

```java
private final String name;
private final int age;
private final String city;
```

The constructor is private and objects are created only through the Builder class.

---

### 🔹 Builder Class

Static inner class responsible for building User objects step-by-step.

```java
public static class Builder
```

Uses method chaining:

```java
User user = new User.Builder()
        .setName("Pushpendra")
        .setAge(22)
        .setCity("Mumbai")
        .build();
```

---

### 🔹 BuilderMain.java

Main class used to test the Builder Design Pattern implementation.

---

## ▶️ Sample Output

```text
User{name='Pushpendra', age=22, city='Mumbai'}
```

---

## 🔄 Workflow

1. Create Builder object
2. Set required fields using setter methods
3. Call `build()` method
4. Builder creates final immutable object
5. Use created object

---

## 💡 Real-World Use Cases

- StringBuilder in Java
- Lombok @Builder
- HTTP Request Builders
- Database Configuration Objects
- Complex DTO Object Creation

---

## 🎯 Why Use Builder Pattern?

When a class contains:
- many fields
- optional parameters
- complex object creation logic

Builder Pattern provides a clean and scalable solution.

It improves:
- readability
- maintainability
- flexibility

---

## ⚡ Key Features Implemented

✅ Immutable Object Creation  
✅ Method Chaining  
✅ Encapsulation  
✅ Clean Object Construction  
✅ Readable Syntax

---

## 👨‍💻 Example Code

```java
User user = new User.Builder()
        .setName("Pushpendra")
        .setAge(22)
        .setCity("Mumbai")
        .build();

System.out.println(user);
```

---

## 📚 Learning Outcome

This implementation demonstrates:
- Builder Design Pattern fundamentals
- Method chaining
- Immutable object creation
- Clean coding practices in Java

---

## 👨‍💻 Author

### Pushpendra Singh

GitHub:
https://github.com/pushpendrahub