package day01;


public class FizzBuzz {
    /*
    loop 1 - 100
    divisible 3 -> Fizz
    divisible 5 -> Buzz
    divisible 3 and 5 -> FizzBuzz
    print number
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
