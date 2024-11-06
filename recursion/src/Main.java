import java.util.Scanner;

public class Main {
    static void printinecreasing(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        printinecreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printinecreasing(n);
    }
}