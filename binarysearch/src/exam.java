import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int schools = sc.nextInt();
            int students = sc.nextInt();
            int pass_student = sc.nextInt();
            int total_student = students*schools;
            System.out.println(total_student);
            if((total_student/2)>pass_student){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
