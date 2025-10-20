import java.util.Arrays;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    //Your code
    char[] nums = String.valueOf(num).toCharArray();
    Arrays.sort(nums);
    
    String digits = new String(nums);
    
    StringBuilder sb = new StringBuilder(digits).reverse();
    
    return Integer.parseInt(sb.toString());
    
    }
}
