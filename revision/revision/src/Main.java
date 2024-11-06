import java.util.Scanner;

public class Main {
    static void nirma(int[] arr ){
        int right = 0;
        int left = arr.length-1;
        while(left<right){
            if (arr[left]==1&&arr[right]==0){
                swaparray(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }
        }

    }
    static void swaparray(int[] arr,int i ,int j ){
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];



    }
    static void printarry(int[] arr){
        for (int i = 0 ;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static  int[] rotate(int[] arr,int k ){
        int o = 0;
        int[] ans  = new int[arr.length];
        if (k> arr.length){
            k = k % arr.length;
        }
        for (int i  = arr.length-k; i< arr.length;i++){
            ans[o++]=arr[i];
        }
        for (int i = 0;i< arr.length-k;i++){
            ans[o++]=arr[i];
        }
        return ans;




    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array lenght.." + "");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0 ;i<n;i++){
            arr[i]=sc.nextInt();

        }
//        System.out.println("enter the rotate number");
//        int k = sc.nextInt();
//        int [] ans = rotate(arr,k);
//        printarry(ans);
        nirma(arr);
        printarry(arr);





    }
}