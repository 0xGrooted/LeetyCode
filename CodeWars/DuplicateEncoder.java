public class DuplicateEncoder {
    static String encode(String word) {
        word = word.toLowerCase();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (word.indexOf(c) == word.lastIndexOf(c)) {
                // The character is unique, so append "("
                ans.append('(');
            } else {
                // The character is a duplicate, so append ")"
                ans.append(')');
            }
        }
        return ans.toString();
    }
}
