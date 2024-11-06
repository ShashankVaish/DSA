import java.util.Scanner;

public class jamsha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0;i<t;i++){
            int time = sc.nextInt();
            int ass_time = 10;
            int assi = 3;
            if((ass_time-time)>=3){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
