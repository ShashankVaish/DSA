import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {78,12,89,0},
                {45,78,21},
                {78,36,5,2,1}
        };
        int target=78;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));

    }
    static int[] search(int[][] arr,int target){
        for (int row = 0;row<arr.length;row++){
            for (int col = 0;col<arr[row].length;col++){
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int[] a:arr){
            for (int ain: a){
                if (ain>max){
                    max=ain;
                }

            }
        }
        return max;
    }
}