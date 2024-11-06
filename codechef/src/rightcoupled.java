import java.util.Scanner;

public class rightcoupled {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i<=n;i++){
            int x = sc.nextInt();
            for (int j = 0;j<x;j++){
                for (int k = j;k<x;k++){

                    if (j*k==x&&j/k>=0.5){
                        flag=1;
                        break;
                    }


                }

            }
            System.out.println(flag);
        }
    }
}
