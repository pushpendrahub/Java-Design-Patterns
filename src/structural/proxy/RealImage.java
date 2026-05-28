package proxy;

public class RealImage implements Image{
    private final String fileName;

    public RealImage(String fileName){
        this.fileName=fileName;
        load();
    }

    private void load(){
        System.out.println("Loading image "+fileName);
    }

    @Override
    public void display(){
        System.out.println("Displaying image "+fileName);
    }
}
