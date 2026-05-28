# Proxy Design Pattern

## 📌 Overview

Proxy Design Pattern is a Structural Design Pattern used to provide a placeholder or intermediary object that controls access to another object.

It helps add additional behavior such as:

* Lazy Loading
* Access Control
* Security
* Logging
* Caching

without modifying the original object.

Proxy Pattern is commonly used in:

* Image Loading Systems
* Security Layers
* Remote Services
* Database Access
* Virtual Proxies

---

## 🚀 Advantages

✅ Lazy Initialization Support
✅ Improves Performance
✅ Controlled Object Access
✅ Adds Security and Logging
✅ Reduces Resource Consumption

---

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Structural Design Pattern

---

## 📂 Project Structure

```bash id="v7j5mi"
proxy/
│
├── Image.java
├── ProxyImage.java
├── RealImage.java
├── ProxyMain.java
└── README.md
```

---

## 📖 Classes Explanation

### 🔹 Image.java

Common interface implemented by both RealImage and ProxyImage.

```java id="kfq4i7"
package proxy;

public interface Image {
    void display();
}
```

---

### 🔹 RealImage.java

Represents the actual heavy object responsible for loading and displaying the image.

```java id="20n70t"
package proxy;

public class RealImage implements Image {

    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Loading image: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}
```

---

### 🔹 ProxyImage.java

Proxy class that controls access to the RealImage object and performs lazy initialization.

```java id="y0r2mh"
package proxy;

public class ProxyImage implements Image {

    private RealImage realImage;

    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {

        if (realImage == null) {

            System.out.println("Proxy checking access before displaying image...");

            realImage = new RealImage(fileName);
        }

        realImage.display();
    }
}
```

---

### 🔹 ProxyMain.java

Main class used to demonstrate Proxy Design Pattern.

```java id="l8z7im"
package proxy;

public class ProxyMain {

    public static void main(String[] args) {

        Image image = new ProxyImage("Pushpendra.jpg");

        image.display();

        System.out.println("\nSecond Call:\n");

        image.display();
    }
}
```

---

## ▶️ Sample Output

```text id="k4lv9m"
Proxy checking access before displaying image...
Loading image: Pushpendra.jpg
Displaying image: Pushpendra.jpg

Second Call:

Displaying image: Pushpendra.jpg
```

---

## 🔄 Workflow

1. Client creates `ProxyImage`
2. Proxy object delays creation of `RealImage`
3. On first `display()` call:

   * RealImage is created
   * image is loaded
4. On subsequent calls:

   * existing object is reused
   * image is displayed directly

---

## 💡 Real-World Use Cases

* Image Lazy Loading
* Spring Security Proxies
* Hibernate Lazy Initialization
* Remote API Access
* Caching Systems

---

## ⚡ Key Features Implemented

✅ Lazy Loading
✅ Access Control
✅ Object Delegation
✅ Memory Optimization
✅ Structural Design Pattern

---

## 🎯 Why Use Proxy Pattern?

Proxy Pattern is useful when:

* object creation is expensive
* controlled access is needed
* security checks are required
* lazy initialization improves performance

---

## 📚 Learning Outcome

This project demonstrates:

* Proxy Design Pattern fundamentals
* Lazy object initialization
* Access control through proxy objects
* Performance optimization techniques in Java

---

## 🧠 UML Representation

```text id="it3v7h"
              Image
                ^
                |
       -----------------
       |               |
 ProxyImage      RealImage
       |
       |
 controls access to
```

---

## 👨‍💻 Author

### Pushpendra Singh

GitHub:
https://github.com/pushpendrahub
