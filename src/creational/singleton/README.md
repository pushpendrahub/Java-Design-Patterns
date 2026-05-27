# Singleton Design Pattern

## 📌 Overview

Singleton Design Pattern is a Creational Design Pattern used to ensure that only one instance of a class is created throughout the application lifecycle.

It provides a global access point to the single object instance.

Singleton Pattern is commonly used in:
- Database Connections
- Logger Classes
- Configuration Management
- Caching
- Thread Pools

---

## 🚀 Advantages

✅ Ensures Single Object Creation  
✅ Saves Memory  
✅ Global Access Point  
✅ Controlled Resource Usage  
✅ Lazy Initialization Support

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)

---

## 📂 Project Structure

```bash
singleton/
│
├── Singleton.java
├── SingletonMain.java
└── README.md
```

---

## 📖 Classes Explanation

### 🔹 Singleton.java

Singleton class responsible for creating only one object instance.

```java
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
```

---

### 🔹 SingletonMain.java

Main class used to test Singleton Design Pattern.

```java
public class SingletonMain {

    public static void main(String[] args) {

        Singleton db1 = Singleton.getInstance();
        Singleton db2 = Singleton.getInstance();

        System.out.println(db1.hashCode());
        System.out.println(db2.hashCode());
    }
}
```

---

## ▶️ Sample Output

```text
1510467688
1510467688
```

Both objects produce the same hashcode, proving that only one object instance exists.

---

## 🔄 Workflow

1. Client calls `getInstance()`
2. If object does not exist:
    - create object
3. If object already exists:
    - return existing object
4. Same object reused everywhere

---

## 💡 Real-World Use Cases

- Database Connection Pool
- Logger Frameworks
- Runtime Configuration
- Cache Managers
- Application Settings

---

## ⚡ Key Features Implemented

✅ Lazy Initialization  
✅ Single Object Creation  
✅ Global Access Method  
✅ Memory Efficient Design

---

## 🎯 Why Use Singleton Pattern?

Singleton Pattern is useful when:
- exactly one object is required
- shared resource management is needed
- centralized configuration is required

---

## 📚 Learning Outcome

This project demonstrates:
- Singleton Design Pattern fundamentals
- Lazy Initialization
- Object reuse
- Controlled object creation in Java

---

## 👨‍💻 Author

### Pushpendra Singh

GitHub:
https://github.com/pushpendrahub