import java.util.Scanner;

public class number {
    static void multiply(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if (c1!=r2){
            System.out.println("wrong dimension");
        }
        int[][] ans = new int[r1][c2];
        for (int i = 0;i<r1;i++){
            for (int j = 0;j<c2;j++){
                for (int k =0;k<c1;k++){
                    ans[i][j]+=(a[i][k]*b[k][j]);
                }
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of r1" +
                " ");
        int r1 = sc.nextInt();
        System.out.println("enter the lenght c1");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        for (int i =0;i< a.length;i++){
            for (int j = 0;j< a.length;j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter the length of r2" +
                " ");
        int r2 = sc.nextInt();
        System.out.println("enter the lenght c2");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        for (int i =0;i< a.length;i++){
            for (int j = 0;j< a.length;j++){
                b[i][j]= sc.nextInt();
            }
        }
        System.out.println("the multiplication array is :-");
        multiply(a,r1,c1,b,r2,c2);

    }
}
