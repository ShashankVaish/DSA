import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1;i<=r;i++){
            for (int j =1;j<=r;j++){
                if (i ==0|| i==r|| j ==r||j==0){
                    System.out.print("*");
                }else if((i+j)%2==0){
                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
