import java.util.Scanner;

public class bullet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0;i<t;i++){
            int speed = sc.nextInt();
            int distance = sc.nextInt();
            int time = sc.nextInt();
            int j = distance/speed;

            if (j>time){
                System.out.println(0);
            }
            else {
                System.out.println(time-j);
            }
        }
    }
}
