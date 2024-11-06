import java.util.Scanner;

public class percentagecalculated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of subject in series");
        float e=sc.nextFloat();
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float d=sc.nextFloat();
//        float e=sc.nextFloat();
        float per = (a+b+c+d+e)/5;
        if (per>=90){
            System.out.println("Grade A");
            
        } else if (per>=75) {
            System.out.println("Grade B");

        } else if (per>=40) {
            System.out.println("Grade C");

        }
        else {
            System.out.println("fail");
        }


    }
}
