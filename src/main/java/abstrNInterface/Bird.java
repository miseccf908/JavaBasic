package abstrNInterface;

public abstract class Bird implements AnimalMove{
    String clazz = "Bird";
    @Override
    public void move() {
        System.out.println("Bird flying");
    }
    abstract boolean canFlyHigh();

    static void whatIWant(){
        System.out.println("I want to be no1");
    }
}
