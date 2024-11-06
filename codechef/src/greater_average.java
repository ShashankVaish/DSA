import java.util.Scanner;

public class greater_average {
    static void greateravergae(int a,int b,int c){
        if((a+b)/2.0>c){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i<n;i++){
            int a=sc.nextInt(),b= sc.nextInt(),c=sc.nextInt();
            greateravergae(a,b,c);
        }
    }
}
