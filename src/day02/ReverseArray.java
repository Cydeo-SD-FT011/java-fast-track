package day02;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {4,3,1,34,5};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(reverseArray(nums)));
    }
    public static int[] reverseArray(int[] nums) {
        //create array with same size
        int[] reversed = new int[nums.length];
        for(int i = nums.length-1, j = 0; i >= 0; i--, j++) {
            reversed[j] = nums[i];
        }
        return reversed;
    }
}
