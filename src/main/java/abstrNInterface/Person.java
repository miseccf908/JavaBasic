package abstrNInterface;

abstract class Person {
    String sex;//default is friendly. of course it could be defined as 'public'
    private String name="person";
    abstract void eyes();
    void walk(){
        System.out.println("using legs");
    };
    abstract void skin();
    void printInfo(){
        eyes();walk();skin();eat();
    }

    protected void eat(){
        System.out.println("Person eat cooked food.");
    }
    private void language(){};
    //void sports(){};
}
