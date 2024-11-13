package Misc;

import java.util.HashMap;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "tar"));
    }

    public static boolean isAnagram(String s, String t){
        HashMap<Character, Integer> freqMap =  new HashMap<>();
        return true;

    }
   /* public static boolean isAnagram(String s, String t){
        if(s.length() != t.length())
            return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        for(int i=0; i<sArr.length; i++){
            if(sArr[i] != tArr[i])
                return false;
        }

        return true;
    }*/
}
