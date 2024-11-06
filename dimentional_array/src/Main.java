import java.util.Scanner;

public class Main {
    static void addmatrices(int[][] arr,int r1,int c1,int[][] arr2,int r2,int c2){
        if (r1!=r2||c1!=c2){
            System.out.println("error in dimensions");
            return;
        }
        int[][] sum = new int[r1][c1];
        for (int i =0;i<r1;i++){
            for (int j = 0 ;j<c1;j++){
                sum[i][j] = arr[i][j]+arr2[i][j];
            }
        }
//
        print2darray(sum);

    }
    static void multiply(int[][] arr, int r1,int c1,int[][] arr2,int r2,int c2){
        if(c1!=r2){
            System.out.println("wrong dimensional array");
            return;

        }
        int[][] ans = new int[r1][c2];
        for (int i = 0;i<r1;i++){
            for (int j = 0;j<c2;j++){
                for (int k = 0;k<r2;k++){
                    ans[i][j]+= (arr[i][k]*arr2[j][k]);
                }
            }
        }
        print2darray(ans);


    }
    static void print2darray(int[][] arr){
        for(int i = 0;i< arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number of rows");
        int r1  = sc.nextInt();
        System.out.println("enter the number of columns");
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];
        for (int i = 0 ;i<r1;i++){
            for (int j = 0;j<c1;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter 2nd  the number of rows");
        int r2  = sc.nextInt();
        System.out.println("enter 2nd the number of columns");
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        for (int i = 0 ;i<r2;i++){
            for (int j = 0;j<c2;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("the sum of the matrices is that:-");
//        addmatrices(arr,r1,c1,arr2,r2,c2);


//        print2darray(sum);
        multiply(arr,r1,c1,arr2,r2,c2);




    }
}