package adapter;

class AdapterMain {

    public static void main(String[] args){
        Android a=new Android();
        Iphone i=new Adapter(a);
        i.charge();
    }
}