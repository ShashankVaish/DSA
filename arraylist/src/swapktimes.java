import java.util.Scanner;

public class swapktimes {
    static int[] swap(int[] arr,int k){
        int l = 0;
        int n = arr.length;
        if(k>n){
            k=k%n;
        }
        int[] ans = new int[n];
        for (int i = n-k;i<n;i++){
            ans[l]=arr[i];
            l++;

        }
        for (int i = 0;i<n-k;i++){
            ans[l]=arr[i];
            l++;
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr ={1,7,8,9};
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] ans = swap(arr,t);
        for (int i = 0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
