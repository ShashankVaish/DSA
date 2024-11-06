import java.util.Scanner;

public class Main {
    static int shipdrop(int k,int[] arr,int n){
        int i =0;
        int j = arr.length-1;
        for (int o =0;o<k;o++){
            if (o%2==0){
                arr[i]=arr[i]-1;

            }else {
                arr[j]=arr[j]-1;
            }
            if (arr[i]==0){
                i++;
            }
            if (arr[j]==0){
                j--;
            }

        }
        int count=0;
        for (int h =0;h< arr.length;h++){
            if (arr[h]>0) count++;

        }
        int ans = n-count;
        return ans;


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int ans = shipdrop(k,arr,n);
        System.out.println("the ans is :"+ans);



    }
}