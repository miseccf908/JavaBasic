package hash;

import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.logging.Logger;

public class Person {
    public String name;
    public int id;
    public int age;


    public Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id &&
                age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, age);
    }

    public static void main(String arg[]){
        Logger log = Logger.getLogger("Person");

        Person p1= new Person(new String("Jack"),1,20);
        Person p2= new Person("Tom",2,23);
        Person p3= new Person(new String("Jack"),1,20);
        //如果只是override equals没有重写hashcode的话，就会导致equals true而hashcode不等。这是违反hashcode的规则的
        //java中的两个对象，如果equals true，那么hashcode必然相等。hashcode相等，equals不一定true
        System.out.println("p1.equals(p3): " + p1.equals(p3));
        System.out.println("p1.hashcode ==p3.hashcode:" + (p1.hashCode()==p3.hashCode()));//两个“Jack”字符串虽然是不同的对象，但由于String重写了hashcode，所以Person.name的hashcode相同，
                                                                                            //所以,Person.hashcode()也相等。
        log.info("p1.equals(p3): " + p1.equals(p3));
        log.info("p1.hashcode ==p3.hashcode:" + (p1.hashCode()==p3.hashCode()));
        log.info("p1's hashcode: "+p1.hashCode());
        Person p4=null;
        log.info("p1.equals(null) : "+p1.equals(null));



//        AbstractSet

//                ArrayDeque
//        BlockingDeque
//LinkedList
//        LinkedHashSet
//ArrayList
//        LinkedHashMap
//Hashtable
//Vector
//Collections
//        HashMap
//EnumMap



    }
}
