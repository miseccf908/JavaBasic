package abstrNInterface;

public interface AnimalMove {
    String clazz="Animal";
    void move();
    private String whoAmI(){
        return clazz;
    }
    static void whatIWant(){
        System.out.println("I want to be no1");
    }
}
