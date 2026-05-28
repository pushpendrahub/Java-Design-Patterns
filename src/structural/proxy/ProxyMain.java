package proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Image image=new ProxyImage("Pushpendra.jpg");
        image.display();
        System.out.println("\nSecond Call:\n");
        image.display();
    }
}
