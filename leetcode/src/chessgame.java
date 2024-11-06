import java.util.Scanner;

public class chessgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0;i<t;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = y-x;
            if(z>0){
                System.out.println( (int) Math.ceil(z/8.0));
            }
            else {
                System.out.println(0);
            }
        }
    }
}
