import java.util.Scanner;

public class number2 {
    static void transpose(int[][] arr,int r1,int c1){
        int[][] ans = new int[r1][c1];
        for (int i = 0;i< arr.length;i++){
            for (int j=0;j<c1;j++){
                ans[j][i]= arr[i][j];
            }

        }
        print(ans);

    }
    static void print(int[][] arr){
        for (int i = 0 ;i< arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void swap(int a ,int b){
        a = a+b;
        b = a-b;
        a = a - b;


    }
    static void transposeinplace(int[][] arr,int r1,int c1){
        for (int i = 0 ;i<r1;i++){
            for (int j = i;j<c1;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
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
//        transpose(arr,r1,c1);
        System.out.println("the transpose array");
        transposeinplace(arr,r1,c1);

    }
}
