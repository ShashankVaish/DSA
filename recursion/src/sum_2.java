import java.util.Scanner;

public class sum_2 {
    static void sum2(int[] arr){

        for (int i = 0;i<=arr.length;i++){
            for (int k=i;k<= arr.length;k++){
                if (arr[i]+arr[k]==0){
                    System.out.println("yes");

                }
                System.out.println("no");

            }



        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<=n;i++){
            arr[i] =sc.nextInt();
        }
        sum2(arr);
    }
}
