import java.util.Scanner;
class extentions{
    void printarray(int[] arr){
        for (int i = 0 ;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void swap(int[] arr,int i ,int j){
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
    void reverse(int[] arr,int i ,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    void swaparrayktimesinplace(int[] arr,int k ){
        int n = arr.length;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k-1,n-1);
        reverse(arr,0,n-1);
        printarray(arr);



    }
}
public class Main {
    static void printarray(int[] arr){
        for (int i = 0 ;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swaparraybyktimes(int[] arr,int k ){
        int n = arr.length;
        if (k>n){
            k = k%n;
        }
        int[] ans = new int[n];
        int j = 0;
        for (int i =n-k;i<n;i++){
            ans[j++]=arr[i];

        }
        for (int l = 0;l<n-k;l++){
            ans[j++]=arr[l];
        }
        printarray(ans);

    }

    static int maxvalueinarray(int[] arr){
        int mx = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>mx){
                mx = arr[i];

            }
        }
        return mx;
    }
    static void secondmaxvalueinarray(int[] arr){
        int mx = maxvalueinarray(arr);
        int scmx = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if (mx == arr[i]){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        for (int i =0;i<arr.length;i++){
            if (arr[i]>scmx){
                scmx = arr[i];
            }

        }
        System.out.println("the second max value is:- "+scmx);

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the "+n+" elements");
        for(int i = 0;i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target value:- ");
        int target = sc.nextInt();

//        secondmaxvalueinarray(arr);
//        swaparraybyktimes(arr,target);
        extentions obj = new extentions();
        obj.swaparrayktimesinplace(arr,target);

    }
}