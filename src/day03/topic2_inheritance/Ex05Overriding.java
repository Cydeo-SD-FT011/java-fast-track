package day03.topic2_inheritance;

public class Ex05Overriding {
    public static void main(String[] args) {
        new Sport().perform();
        new Golf().perform();
        new Soccer().perform();
        System.out.println(new Soccer());
        System.out.println(new Golf());
        Sport.training();
        Golf.training();
        System.out.println("------------------------------");
        Building.open();
        Shed.open();

        System.out.println(Building.a);
        System.out.println(Shed.a);
    }
}

class Sport {
    void perform() {
        System.out.println("Performing sport");
    }
    //Method Overloading
    public void perform(String action) {
        System.out.println("Performing " + action);
    }

    public static void training() {
        System.out.println("Doing sports training...");
    }

    @Override
    public String toString() {
        return "Sports " + super.getClass().getSimpleName();
    }
}

class Golf extends Sport{

    public static void training() {
        System.out.println("Doing Golf training...");
    }

    @Override
    void perform() {
        System.out.println("Swinging club");
    }
}
class Soccer extends Sport {
    @Override
    public void perform() {
        System.out.println("Kicking ball");
    }
}

/*

Rules

There must be is-a relationship (inheritance)

The method must keep the same name

The method must keep the same parameters

Access modifier: Needs to be the same or more visible

Return type: must be same or covariant type (same class type or sub class type)

covariant ex:

    class Animal {
        public Animal getType(){
            return new Animal();
        }
    }

    class Bird extends Animal{
        public Bird getType(){
            return new Bird();
        }
    }

    class Hawk extends Bird{
        public Hawk getType(){
            return new Hawk();
        }
    }

 */

// static methods cannot be overridden
class Building {
    static int a = 10;
    static void open() {
        System.out.println("Opening Building");
    }
}
class Shed extends Building{
    static int a = 30;
    static void open() {
        System.out.println("Opening Shed");
    }
}
