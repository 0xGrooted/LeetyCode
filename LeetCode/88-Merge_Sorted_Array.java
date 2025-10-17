class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /**
        * We are asked to merge to arrays nums1, nums2. These are sorted
        * nums1 has enough size to store both nums1 and nums2
        *
        * Requirements
        *   + Ascending order
        *   + We need to find a way to move the array up
        *   + n Represents the size of nums2.
        *
        * Questions in interview?
        *   - ?
        *
        *
        */

        // Solution
        // So here I would begin by starting my logic of comparing the two

        // Potential Question: Why are we using the && Operators? 
        // I used them to ensure will only increment if i is less than both
        // nums1 & nums2.
        
       // Create a new result array to hold merged elements
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while (i < m && j < n) {

            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } 
            
            else {
                result[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1
        while (i < m) {
            result[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2
        while (j < n) {
            result[k++] = nums2[j++];
        }

        // Copy back to nums1
        for (int x = 0; x < m + n; x++) {
            nums1[x] = result[x];
        }
    }
}
