package Misc;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal, Panama!"));
    }
    public static boolean isPalindrome(String s){

        char[] chrArr = s.toLowerCase().toCharArray();
        //remove all special characters including spaces etc -- how?
        int left = 0, right = chrArr.length-1;
        while (left<right){
            if(Character.isLetter(chrArr[left]) != Character.isLetter(chrArr[right]))
                return false;
            else {
                left++;
                right--;
            }
        }

        return true;

        //use 2 pointers left and right and keep checking until charr[left] != char[right];

    }
}
