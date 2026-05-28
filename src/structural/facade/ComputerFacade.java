package facade;

public class ComputerFacade {
    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public ComputerFacade(){
        cpu=new Cpu();
        memory=new Memory();
        disk=new Disk();
    }

    public void start(){
        cpu.start();
        memory.load();
        disk.read();
        System.out.println("Computer started successfully");
    }
}
