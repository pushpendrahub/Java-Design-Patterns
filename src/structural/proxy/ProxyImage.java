package proxy;

public class ProxyImage implements Image{
    private RealImage realImage;
    private final String fileName;

    public ProxyImage(String fileName){
        this.fileName=fileName;
    }

    @Override
    public void display(){
        if(realImage==null){
            realImage=new RealImage(fileName);
        }
        System.out.println("Proxy checking access before displaying image...");
        realImage.display();
    }
}
