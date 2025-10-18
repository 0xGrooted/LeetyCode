package AI_Prep.Level2;

import java.util.Arrays;

public class TopElemenets {
    public static void main(String[] args) {
        /*
         * Top N Elements
         * From a list of numbers, return the top 3 largest numbers.
         * Example: [10, 4, 7, 2, 9, 12] → [12,10,9]
         */

        int[] nums = {10,12,100,4,109,121};

        Arrays.sort(nums);
        System.err.println("Top Element: " + nums[nums.length - 1]);
        System.err.println("Top Element: " + nums[nums.length - 2]);
        System.err.println("Top Element: " + nums[nums.length - 3]);
    }
}
