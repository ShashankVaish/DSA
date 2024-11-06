import java.util.Scanner;

public class spiral_matrix_practise {
    static void spiral(int[][] matrix,int r,int c){
        int toprow =0,bottomrow= r-1,leftcol = 0,rightcol = c-1;
        int totalelement = 0;
        while(totalelement<r*c){
            for (int i = leftcol;i<=rightcol;i++){
                System.out.print(matrix[toprow][i]+" ");
                totalelement++;
            }
            toprow++;
            for (int j = toprow;j<=bottomrow;j++){
                System.out.print(matrix[j][rightcol]+" ");
                totalelement++;
            }
            rightcol--;
            for (int i = rightcol;i>=leftcol;i--){
                System.out.print(matrix[bottomrow][i]+" ");
                totalelement++;
            }
            bottomrow--;
            for (int j=bottomrow;j>=toprow;j--){
                System.out.print(matrix[j][leftcol]+" ");
                totalelement++;
            }
            leftcol++;
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
        spiral(arr,r1,c1);
    }
}
