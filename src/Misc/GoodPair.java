package Misc;

public class GoodPair {
    public static void main(String[] args) {
        System.out.println(numGoodPairs(new int[]{1, 1,1,1}));
    }

    public static int numGoodPairs(int[] nums) {
        int countPairs =0;
        for(int i=0; i< nums.length; i++){
            for(int j=i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    countPairs++;
                }
            }
        }
        return countPairs;
    }
}