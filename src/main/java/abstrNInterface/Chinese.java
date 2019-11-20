package abstrNInterface;

public  class Chinese extends Person {
    String sex;//="unknown";
    private static String NATIONAL="Chinese";
    @Override
    void eyes() {
        System.out.println("Black Eyes");
    }

    @Override
    void walk() {
        super.walk();
    }

    @Override
    void skin() {
        //System.out.println("Yellow skin");
    }

    public void printInfo(){
        //eyes();
        walk();
        skin();
        eat();
        System.out.println("This is a "+NATIONAL);
    }
    @Override
    protected void eat() {
        //super.eat();
        System.out.println("Chinese eat rice.");
    }

    //abstract void read();
}
