# Observer Design Pattern - YouTube Notification System

## 📌 Overview

Observer Design Pattern is a Behavioral Design Pattern used to establish a one-to-many dependency between objects so that when one object changes its state, all dependent objects are automatically notified.

This project demonstrates the Observer Design Pattern using a simple YouTube notification system where subscribers receive notifications whenever a channel uploads a new video.

Observer Pattern is commonly used in:

* YouTube Notifications
* Event Listeners
* News Subscription Systems
* Stock Market Applications
* Social Media Notifications

---

## 🚀 Advantages

✅ Loose Coupling Between Objects  
✅ Dynamic Subscription Handling  
✅ Easy Scalability  
✅ Supports Event-Driven Architecture  
✅ Improves Maintainability  

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
└── observer/
    ├── Observer.java
    ├── Subject.java
    ├── Subscriber.java
    ├── YoutubeChannel.java
    ├── ObserverMain.java
    └── README.md
````

---

## 📖 Classes Explanation

### 🔹 Observer.java

Observer interface that defines the notification behavior.

```java
package behavioral.observer;

public interface Observer {

    void notified(String title);
}
```

---

### 🔹 Subject.java

Subject interface responsible for managing subscribers.

```java
package behavioral.observer;

public interface Subject {

    void subscribe(Observer ob);

    void unSubscribe(Observer ob);

    void notify(String title);
}
```

---

### 🔹 Subscriber.java

Concrete observer class representing YouTube subscribers.

```java
package behavioral.observer;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void notified(String title) {
        System.out.println(
            "Hello " + this.name +
            " new videos uploaded " + title
        );
    }
}
```

---

### 🔹 YoutubeChannel.java

Concrete subject class that maintains subscriber list and sends notifications.

```java
package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
        this.subscribers.add(ob);
    }

    @Override
    public void unSubscribe(Observer ob) {
        this.subscribers.remove(ob);
    }

    @Override
    public void notify(String title) {

        for(Observer ob : this.subscribers){
            ob.notified(title);
        }
    }
}
```

---

### 🔹 ObserverMain.java

Main class used to demonstrate the Observer Design Pattern.

```java
package behavioral.observer;

public class ObserverMain {

    public static void main(String[] args) {

        YoutubeChannel channel = new YoutubeChannel();

        Subscriber pushpendra =
                new Subscriber("Pushpendra");

        Subscriber aman =
                new Subscriber("Aman");

        channel.subscribe(aman);
        channel.subscribe(pushpendra);

        channel.notify("Observer Pattern");

        channel.notify("Strategy Pattern");
    }
}
```

---

## ▶️ Sample Output

```text
Hello Aman new videos uploaded Observer Pattern
Hello Pushpendra new videos uploaded Observer Pattern

Hello Aman new videos uploaded Strategy Pattern
Hello Pushpendra new videos uploaded Strategy Pattern
```

---

## 🔄 Workflow

1. Create a YouTube channel object
2. Create subscriber objects
3. Subscribe users to the channel
4. Upload new videos
5. All subscribers receive notifications automatically

---

## 💡 Real-World Use Cases

* YouTube Channel Notifications
* Instagram Followers Updates
* Email Subscription Services
* News Broadcasting Systems
* Event Management Systems

---

## ⚡ Key Features Implemented

✅ Dynamic Subscriber Management
✅ Automatic Notification System
✅ Loose Coupling Between Objects
✅ Event-Driven Communication
✅ Behavioral Design Pattern

---

## 🎯 Why Use Observer Pattern?

Observer Pattern is useful when:

* multiple objects depend on one object
* automatic notifications are required
* event-driven systems are needed
* objects should remain loosely coupled
* dynamic subscription handling is required

---

## 📚 Learning Outcome

This project demonstrates:

* Observer Design Pattern fundamentals
* Event-driven communication
* Loose coupling in Java
* Interface-based design
* Subscriber notification systems

---

## 🧠 UML Representation

```text
                 Subject
                    ^
                    |
            ----------------
            |              |
      YoutubeChannel   Observer
                              ^
                              |
                         Subscriber
```

---

## 👨‍💻 Author

### Pushpendra Singh

GitHub:
https://github.com/pushpendrahub

