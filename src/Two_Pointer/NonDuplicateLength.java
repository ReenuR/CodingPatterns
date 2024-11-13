package Two_Pointer;

public class NonDuplicateLength {
    public static void main(String[] args) {
        System.out.println(moveElements(new int[] { 2, 3, 3, 3, 6, 9, 9 }));
    }
    public static int moveElements(int[] arr) {
        int nonDuplicate = 0;
        int next = 1;
        while(next < arr.length){
            if(arr[nonDuplicate] != arr[next]){
                arr[++nonDuplicate] = arr[next];
            }
            next++;
        }

        return nonDuplicate;
    }
}
