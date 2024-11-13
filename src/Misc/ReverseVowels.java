package Misc;

import java.util.Arrays;

public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("AEIOU"));
    }
    public static String reverseVowels(String s){

        char[] charArr = s.toCharArray();
        for(int leftPointer = 0, rightPointer = charArr.length-1; leftPointer<rightPointer; ){
            if((charArr[leftPointer] == 'A' || charArr[leftPointer] == 'E' ||charArr[leftPointer] == 'I'  || charArr[leftPointer] == 'O' ||
                    charArr[leftPointer] == 'U' ||charArr[leftPointer] == 'a'  || charArr[leftPointer] == 'e' ||charArr[leftPointer] == 'i'  || charArr[leftPointer] == 'o'
                    ||charArr[leftPointer] == 'u') && (charArr[rightPointer] == 'A' || charArr[rightPointer] == 'E' ||charArr[rightPointer] == 'I'  || charArr[rightPointer] == 'O' ||
                    charArr[rightPointer] == 'U' ||charArr[rightPointer] == 'a'  || charArr[rightPointer] == 'e' ||charArr[rightPointer] == 'i'  || charArr[rightPointer] == 'o'
                    ||charArr[rightPointer] == 'u')){
                char temp = charArr[leftPointer];
                charArr[leftPointer] =charArr[rightPointer];
                charArr[rightPointer] = temp;
                leftPointer++;
                rightPointer--;

            }
            else{
                if(!(charArr[leftPointer] == 'A' || charArr[leftPointer] == 'E' ||charArr[leftPointer] == 'I'  || charArr[leftPointer] == 'O' ||
                        charArr[leftPointer] == 'U' ||charArr[leftPointer] == 'a'  || charArr[leftPointer] == 'e' ||charArr[leftPointer] == 'i'  || charArr[leftPointer] == 'o'
                        ||charArr[leftPointer] == 'u'))
                    leftPointer++;
                if(!(charArr[rightPointer] == 'A' || charArr[rightPointer] == 'E' ||charArr[rightPointer] == 'I'  || charArr[rightPointer] == 'O' ||
                        charArr[rightPointer] == 'U' ||charArr[rightPointer] == 'a'  || charArr[rightPointer] == 'e' ||charArr[rightPointer] == 'i'  || charArr[rightPointer] == 'o'
                        ||charArr[rightPointer] == 'u'))
                    rightPointer --;
            }

        }
        return Arrays.toString(charArr);
    }
}
