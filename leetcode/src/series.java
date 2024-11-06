import java.util.Scanner;

public class series {
    static void series_dec(int n ,int t){
        if (n<0){
            System.out.print(n+" ");
//            series_inc(n,t);
        }
        else{
            System.out.print(n+" ");
            series_dec(n-5,t);
            System.out.print(n+" ");
        }

    }
    static void series_inc(int n , int t){
        if(n==t){
            System.out.print(n+" ");
            return;
        }
        else{
            System.out.print(n+" ");
            series_inc(n+5,t);
            System.out.print(n+" ");

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        series_dec(n,t);

    }
}
