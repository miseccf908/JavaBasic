package abstrNInterface;

class Chicken extends Bird {
    String clazz="Chicken";
    @Override
    public void move() {
        System.out.println("Chicken cannot fly too high.");
    }

    @Override
    boolean canFlyHigh() {return false;}

    public static void main(String[] arg){
        AnimalMove b = new Chicken();
        //AnimalMove b = new Bird() ;
        b.move();
        System.out.println("this is "+AnimalMove.clazz);
    }
}
