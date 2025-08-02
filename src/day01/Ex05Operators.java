package day01;

import java.util.function.Predicate;

public class Ex05Operators {
    public static void main(String[] args) {

        int a = 4 + 4;
        byte b = (byte) (a + 1);
        System.out.println("b = " + b);
//        short c = a + 2;
        // Remember that arithmetic operations result in int type, so they cannot directly be stored into a byte or short variable. They would need to be cast

        float f = 4;
        float f2 = 5;
        float f3 = f * f2; // float * float
        System.out.println("f3 = " + f3);
        double f4 = f * f2; // float * float -> automatically goes to bigger type
        int f5 = (int)(f * f2); // float * float -> float is bigger than int type, needs to be cast
        int z = 2;
        double g = 3;
        //int res = z * g; //multiplying int and double results in a double type, so it cannot be directly assigned to an int
        double res = z * g;
        System.out.println("res = " + res);
        int res2 = (int)(z * g); // cast the double to int after the multiplication
        //+, -, /, *, %
        int num = 23;
        if (num % 2 == 0) {
            System.out.println("num is even = " + num);
        } else {
            System.out.println("num is odd = " + num);
        }
        //------------------------------------------------------

        // Shorthand is useful to update a variable without needing to write the whole statement
        //+=, -=, ...
        int a2 = 40;
        a2 = a2 + 10; // this statement will take the value of a2 add 10 and then reassign the result back into the a2 variable. Basically it is adding 10 to the variable's value
        // using shorthand that could have been written:
        int a3 = 40;
        a3 += 10;

        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
        
        String str = "A";
        str += "B";
        str += "C";
        System.out.println("str = " + str);
        
        //------------------------------------------------------
        //increment/decrement -> ++, --
        int n = 10; // 10  -> 11 --> 12
        System.out.println(n++); // 10
        System.out.println(n); //11
        System.out.println(++n); // 12

        int n2 = 5; // 5 -> 4 -> 5 _> 6 -> 5 -> 4
        n2--;
        ++n2;
        System.out.println(++n2); // 6
        System.out.println(--n2); // 5
        System.out.println(n2--); // 5
        System.out.println(n2); // 4

        System.out.println("------------------------------------------------------");

        // relational, comparison operators result in a boolean value
        // > , <. >=, !=, ==..
        System.out.println(4 > 34);
        System.out.println(13 < 100);
        System.out.println(4 == 3);
        System.out.println(4 == 4);
        System.out.println(4 != 3);
//        System.out.println(4 = 3); just one = is used for assignment

        System.out.println("------------------------------------------------------");
        //logical operators: &&, || , !
        /*
           & vs && -> AND
           && -> is more efficient and short circuit
           5 > 7 && 5 > 3 -> False
           5 > 7 & 5 > 3 -> False

           5 > 1 || 5 > 3 -> true
           5 > 1 | 5 > 3 -> true
           5 > 10 || 5 > 3 -> true
           String param = null;
           if(param == null || param.length() = 0) {
            show error
           }
         */
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(5 > 2 && 3 == 3);
        System.out.println(5 > 20 && 3 == 3);
        System.out.println(7 > 0 || 4 < 3);
        System.out.println(7 > 0 | 4 < 3);

        System.out.println("Short circuit function:");

        System.out.println(true || 5/0 == 0);
        //System.out.println(true | 5/0 == 0);

    }
}
