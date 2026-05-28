package adapter;

public class Adapter implements Iphone{
    private Android android;

    public Adapter(Android android){
        this.android=android;
    }
    @Override
    public void charge(){
        System.out.println("Adapter converts Lightning Port to USB-C");
                        
        android.usb();
    }

}