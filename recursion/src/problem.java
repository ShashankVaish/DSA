import java.util.Scanner;

public class problem {
    static void lol(int n){
        System.out.println(n);
        if (n>=2){
            lol(n-1);


        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        lol(n);

    }
}
