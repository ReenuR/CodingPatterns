package Misc;

import java.util.HashMap;

public class Pangram {
    public static void main(String[] args) {

        System.out.println(checkIfPangram("TheQuickBrownFoxJumpsOverTheLazyDog23"));
    }
    public static boolean checkIfPangram(String sentence){
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

    }
}
