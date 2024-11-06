import java.util.Scanner;

public class progresiiveSquare {
    static String prog(int c,int d,int[] arr){


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();


        for (int i = 0;i<times;i++){
            int n = sc.nextInt();
            int c =sc.nextInt();
            int d=sc.nextInt();
            int[] arr = new int[n];
            for (int j =0;j<n;j++){
                arr[j]=sc.nextInt();

            }
            String ans = prog(c,d,arr);

        }
    }
}
