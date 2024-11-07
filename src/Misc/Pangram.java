package Misc;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {

        System.out.println(checkIfPangram("TheQuickBrownFoxJumpsOverTheLazyDog23"));
    }
    /*public static boolean checkIfPangram(String sentence){
        if(sentence.length()<26)
            return false;
         char[] charArray =  sentence.toLowerCase().toCharArray();
         int length = charArray.length;
        HashMap<Character,Integer> map = new HashMap<>();
         for(int i = 0; i<length; i++){
             if(Character.isLetter(charArray[i])) {
                 map.put(charArray[i], map.getOrDefault(charArray[i], 0)+1);
             }
         }
        return map.size()>=26;

    }*/

    public static boolean checkIfPangram(String sentence){
        // Create a set to store unique characters
        Set<Character> seen = new HashSet<>();

        // Iterate over each character using a normal for loop
        for (int i = 0; i < sentence.length(); i++) {
            // Convert the current character to lowercase
            char currChar = Character.toLowerCase(sentence.charAt(i));

            if (Character.isLetter(currChar)) {
                // Add the character to the set
                seen.add(currChar);
            }
        }

        // Return true if set size is 26 (total number of alphabets)
        return seen.size() == 26;
    }
}
