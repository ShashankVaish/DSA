import java.util.Scanner;

public class two_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = new int[n];

        for (int i = 0;i<n;i++){
            for (int j = i+1;j<n;j++){
                if ((nums[i]+nums[j])==target){
                    System.out.println(nums[i]+" "+nums[j]);


                }
            }

        }

    }
}
