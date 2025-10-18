import java.util.*;      

public class Positive {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,-2,3,-4,5,-6};
        int[] a = positiveNumbers(nums);
        for( int i : a){
            System.out.print(" " + i);
        }
        System.out.println("");
    }
    public static int[] positiveNumbers(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =0; i < nums.length; i++){
            if(nums[i] > 0){
                a.add(nums[i]);
            }
        }

        // convert to array
        int[] result = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            result[i] = a.get(i);
        }

        return result;
    }
}