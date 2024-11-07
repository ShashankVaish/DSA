import java.util.Scanner;

public class sum_number {
    static int number_sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;

        }
        if(sum>10){
            n = sum;
            sum = 0;
            while (n > 0) {
                sum += n % 10;
                n = n / 10;

            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = number_sum(n);



        System.out.println(sum);
    }
}
