# Facade Design Pattern

## 📌 Overview

Facade Design Pattern is a Structural Design Pattern used to provide a simplified interface to a complex subsystem.

It hides the complexity of multiple classes and provides a single unified interface for the client to interact with.

Facade Pattern is commonly used in:

* Computer Boot Systems
* Banking Applications
* Home Theater Systems
* APIs and SDKs
* Complex Framework Integration

---

## 🚀 Advantages

✅ Simplifies Complex Systems
✅ Reduces Client Dependency
✅ Improves Code Readability
✅ Promotes Loose Coupling
✅ Hides Internal Implementation Details

---

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Structural Design Pattern

---

## 📂 Project Structure

```bash id="xbl8kc"
facade/
│
├── ComputerFacade.java
├── Cpu.java
├── Memory.java
├── Disk.java
├── FacadeMain.java
└── README.md
```

---

## 📖 Classes Explanation

### 🔹 ComputerFacade.java

Facade class that simplifies interaction with multiple subsystem classes.

```java id="cvvc7q"
package facade;

public class ComputerFacade {

    private final Cpu cpu;
    private final Memory memory;
    private final Disk disk;

    public ComputerFacade() {
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }

    public void start() {

        cpu.start();
        memory.load();
        disk.read();

        System.out.println("Computer started successfully");
    }
}
```

---

### 🔹 Cpu.java

Subsystem class responsible for CPU operations.

```java id="x7x9ws"
package facade;

public class Cpu {

    public void start() {
        System.out.println("CPU started...");
    }
}
```

---

### 🔹 Memory.java

Subsystem class responsible for memory operations.

```java id="1c6rjz"
package facade;

public class Memory {

    public void load() {
        System.out.println("Loading memory...");
    }
}
```

---

### 🔹 Disk.java

Subsystem class responsible for disk operations.

```java id="4l7u8k"
package facade;

public class Disk {

    public void read() {
        System.out.println("Reading data from disk...");
    }
}
```

---

### 🔹 FacadeMain.java

Main class used to demonstrate the Facade Design Pattern.

```java id="bte7hi"
package facade;

public class FacadeMain {

    public static void main(String[] args) {

        ComputerFacade computerFacade = new ComputerFacade();

        computerFacade.start();
    }
}
```

---

## ▶️ Sample Output

```text id="kl0ok7"
CPU started...
Loading memory...
Reading data from disk...
Computer started successfully
```

---

## 🔄 Workflow

1. Client creates `ComputerFacade`
2. Client calls `start()`
3. Facade internally manages:

   * CPU startup
   * Memory loading
   * Disk reading
4. Client interacts with only one simplified interface

---

## 💡 Real-World Use Cases

* Computer Startup Systems
* Banking Service APIs
* Payment Gateway Integration
* Hotel Management Systems
* Spring Framework Internals

---

## ⚡ Key Features Implemented

✅ Simplified Interface
✅ Encapsulation of Complex Logic
✅ Loose Coupling
✅ Easy Client Interaction
✅ Structural Design Pattern

---

## 🎯 Why Use Facade Pattern?

Facade Pattern is useful when:

* systems become complex
* multiple subsystem interactions are required
* simplified APIs are needed
* internal implementation should be hidden

---

## 📚 Learning Outcome

This project demonstrates:

* Facade Design Pattern fundamentals
* Simplifying subsystem interactions
* Encapsulation of complex logic
* Structural Design Patterns in Java

---

## 🧠 UML Representation

```text id="j08y4m"
             Client
                |
                v
        ComputerFacade
         /     |      \
        v      v       v
      Cpu   Memory   Disk
```

---

## 👨‍💻 Author

### Pushpendra Singh

GitHub:
https://github.com/pushpendrahub
