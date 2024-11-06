import java.util.Scanner;

public class greater_average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int X = scanner.nextInt();
            int subscriptionsneeded = (int) Math.ceil(N / 6.0);
            int totalcost = subscriptionsneeded * X;

            System.out.println(totalcost);


        }


    }
}
