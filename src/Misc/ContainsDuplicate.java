package Misc;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4,1};
        System.out.println(containsDuplicate(arr));

    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set =  new HashSet<>();
        for(int num : nums){
            if(set.add(num) == false)
                return true;
        }
        return false;
    }
}
