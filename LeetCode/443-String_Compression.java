class Solution {
    public int compress(char[] chars) {
        /*
        * Problem?
        *  We have a an array of chars, we want to compress it.
        * E.G A,A,A,B,B
        * 8 = A,3,B,2
        *
        * Potential Questions in an interview?
        *   
        */

        // Solution:

        int n = chars.length;
        int write = 0;
        int i = 0;     

        while (i < n) {
            // A A A B B 

            char currentChar = chars[i];
            int count = 0;

            // Count how many times our current character repeats
            while (i < n && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // If count > 1, write the digits of count
            if (count > 1) {
                for (char digit : String.valueOf(count).toCharArray()) {
                    chars[write++] = digit;
                }
            }
        }

        return write;  // new length
    }
}
