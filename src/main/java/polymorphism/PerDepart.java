package polymorphism;

class Employee {
    private String name;
    public Employee(String name )  {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void printName(){}
    public void printEarning(){}
}

class Manager extends Employee {
    protected double salary;
    public Manager( String name, double salary) {
        super( name );
        this.salary = salary;
    }
    public void printName(){
        System.out.println("Manager: " + getName());
    }
    public void printEarning(){
        System.out.println("        earned $ " + salary);
    }
}

class RegularWorker extends Employee {
    protected double salary, overtimePay;
    public RegularWorker( String name, double salary, double overtimePay){
        super( name );
        this.salary = salary;
        this.overtimePay = overtimePay;
    }
    public void printName(){
        System.out.println("RegularWorker: " + getName());
    }
    public void printEarning(){
        System.out.println("        earned $ " + salary);
    }
}

public class PerDepart {

    public void printInfo(Employee ref){
        ref.printName();
        ref.printEarning();
    }

    public static void main( String args[] ) {

        PerDepart perDepart = new PerDepart();

        Manager manager = new Manager( "Wang", 5800.00 );
        RegularWorker rw = new RegularWorker( "Lee", 2980.00, 270.0);

        perDepart.printInfo(manager);
        perDepart.printInfo(rw);
    }
}

