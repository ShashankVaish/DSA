import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for (;num<=n;num++) {
            int i = num;

            int count = 0;
            for (; count > 0; count++) {
                i /= 10;

            }
            int ans = 0;
            int val = num;
            for (; val > 0; ) {
                int digit = val % 10;
                ans += Math.pow(digit, count);
                val /= 10;
            }

            if(ans == num){
                System.out.println(ans);
            }


        }
    }
}



