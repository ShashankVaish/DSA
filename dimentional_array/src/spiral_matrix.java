import java.util.Scanner;

public class spiral_matrix {
    static void print(int[][] arr){
        for (int i = 0 ;i< arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void spiral(int[][] matrix,int r1,int c1){
        int totalelemnt = 0;
        int toprow=0,rightcol=c1-1,leftcol=0,bottomrow=r1-1;
        while(totalelemnt<r1*c1){
//            toprow -> rightcol
            for (int j= leftcol ;j<=rightcol && totalelemnt<r1*c1;j++){
                System.out.print(matrix[toprow][j]+" ");
                totalelemnt++;


            }
            toprow++;
//            rightcol -> bottomrow
            for (int i = toprow;i<=bottomrow && totalelemnt<r1*c1;i++){
                System.out.print(matrix[i][rightcol]+" ");
                totalelemnt++;
            }
            rightcol--;
            for (int j=rightcol;j>=leftcol && totalelemnt<r1*c1;j--){
                System.out.print(matrix[bottomrow][j]+" ");
                totalelemnt++;
            }
            bottomrow--;
            for (int i = bottomrow;i>=toprow && totalelemnt<r1*c1;i-- ){
                System.out.print(matrix[i][leftcol]+" ");
                totalelemnt++;
            }
            leftcol++;

        }
//        print(matrix);

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
        spiral(arr,r1,c1);
    }


}
