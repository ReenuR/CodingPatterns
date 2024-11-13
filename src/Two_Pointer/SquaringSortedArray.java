package Two_Pointer;

public class SquaringSortedArray {
    public static void main(String[] args) {
        int[] result = makeSquares(new int[] { -2, -1, 1, 2, 3 });
         //makeSquares(new int[] {-3, -2, -1});
        for (int num : result)
            System.out.print(num + " ");
        System.out.println();

    }
    public static int[] makeSquares(int[] arr) {
        int n = arr.length;
        int[] squares = new int[n];
        int left = 0;
        int right = n-1;
        int highestSqIndex = n - 1;

        while(left <= right){
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if(leftSquare > rightSquare){
                squares[highestSqIndex--] = leftSquare;
                left++;
            }else{
                squares[highestSqIndex--] = rightSquare;
                right--;
            }
        }

        return squares;
    }
}
