package day03.topic2_inheritance;

public class Clothes {
    String company;
    public static String store = "Macy's";
    public Clothes(String company) {
        this.company = company;
        System.out.println("Clothes constructor");
    }
}

class Jacket extends Clothes {
    public Jacket(String company) {
        super(company);
        System.out.println("Jacket constructor");
    }

    public static void main(String[] args) {
        System.out.println(Jacket.store);
        Jacket jacket = new Jacket("Gap");
        System.out.println(jacket.company);
    }
}
