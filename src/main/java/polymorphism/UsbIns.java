package polymorphism;

interface USB{
    public void start();
    public void stop();
}
class Computer{
    public static void pugin(USB usb){
        usb.start();
        System.out.println("**************working********");
        usb.stop();
        Boolean b ;
    }
}
class Flash implements USB{
    public void start(){
        System.out.println("======U盘开始工作===========");
    }
    public void stop(){
        System.out.println("======U盘停止工作===========");
    }
}
class Print implements USB{
    public void start(){
        System.out.println("======打印机开始工作===========");
    }
    public void stop(){
        System.out.println("======打印机停止工作===========");
    }
}

public class UsbIns{
    public static void main(String[] args){
        Computer.pugin(new Flash());//这种调用的方法，还是第一次见
        Computer.pugin(new Print());
    }
}

