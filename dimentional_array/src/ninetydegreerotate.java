import java.util.Scanner;

public class ninetydegreerotate {
    static void swaparray(int[] arr,int i , int j){
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];

    }
    static void reversearray(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            swaparray(arr,left,right);
            left++;
            right--;
        }
    }
    static void transposeinplace(int[][] arr,int r1,int c1){
        for (int i = 0 ;i<r1;i++){
            for (int j = i;j<c1;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i] = temp;
            }
        }

    }


    static void nintydegreerotate(int[][] arr,int r1,int c1){
        transposeinplace(arr,r1,c1);

        for (int i = 0;i<r1;i++){
            reversearray(arr[i]);


        }
        print(arr);

    }
    static void print(int[][] arr){
        for (int i = 0 ;i< arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the r1" +
                "");
        int r1 = sc.nextInt();
        System.out.println("enter the c1");
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        print(arr);
        System.out.println();
        nintydegreerotate(arr,r1,c1);

    }
}
