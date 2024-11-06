import java.util.Scanner;

public class mario {
    static void algo(int x){
        String[] s = {"NORMAL","HUGE","SMALL"};
        int p = 1;
        System.out.println(s[x%3]);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int x = sc.nextInt();
            algo(x);

        }
    }
}
