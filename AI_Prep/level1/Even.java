import java.util.*;               

public class Even {

    /*
     * Filter Even Numbers
     * Given a list of integers, return only the even numbers.
     * Example: [1,2,3,4,5,6] → [2,4,6]
     */

    public static void main(String[] args) throws Exception {
        int[] nums = {1,2,3,4,5,6};
        int[] a = evenNumbers(nums);
        for( int i : a){
            System.out.print(" " + i);
        }
        System.out.println("");
    }
    public static int[] evenNumbers(int[] nums) {
        List<Integer> evens = new ArrayList<>();

        for (int n : nums) {
            if (n % 2 == 0) {
                evens.add(n);
            }
        }

        // Convert List<Integer> to int[]
        int[] result = new int[evens.size()];
        for (int i = 0; i < evens.size(); i++) {
            result[i] = evens.get(i);
        }

        return result;
    }
}
