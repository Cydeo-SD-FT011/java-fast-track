package day02;

public class Ex08ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {4, 5, 12, 6};

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        System.out.println("----------------------------------------");

        for(int each : arr){
            System.out.println(each);
        }

        /*
            for(DATATYPE NAME : DATA_STRUCTURE){
                CODE
            }
        */


    }
}
