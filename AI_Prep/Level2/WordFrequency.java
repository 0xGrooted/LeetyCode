package AI_Prep.Level2;

import java.util.*;

public class WordFrequency {
    /*
     * Word Frequency Counter
     * Given a string like "apple banana apple orange banana apple",
     * return a frequency map:
     * {apple: 3, banana: 2, orange: 1}
     * 
     * Bonus: Return the word with the highest frequency.
     */

    public static void main(String[] args) {
        String input = "apple banana apple orange banana apple";

        // Split the string into seperate words(split by spaces)
        String[] w = input.split(" ");    

        // Now we can use a hasmap to count the number of strings
        HashMap<String, Integer> words = new HashMap<>();

        for (String wrd : w){
            if(words.containsKey(wrd) == true){
                words.put(wrd, words.get(wrd) +1);
            }
            else{
                words.put(wrd, 1);
            }
        }

        System.out.println(words);
    }
    
}
