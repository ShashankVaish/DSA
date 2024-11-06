import java.util.Scanner;

public class Main {
    static void first_program(int[] arr,int target)
    {
        for (int i =0;i<arr.length;i++){
            if (arr[i]==target){
                System.out.println("element found in"+i);
                return;
            }
        }
        System.out.println("not found");

    }
    static void binary_search(int[] arr,int target){
        int low =0;
        int high = arr.length;
        while(low<=high){
            int mid = (high+low)/2;
            if (arr[mid]== target){
                System.out.println("element foun"+mid);
                return;
            } else if (arr[mid]>target) {
                low=mid+1;
            }
            else{
                high=mid-1;


            }
        }
        System.out.println("not found");

    }
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ;i<n;i++){
            arr[i]= sc.nextInt();

        }
        System.out.println("enter the search element ");
        int target = sc.nextInt();
        first_program(arr,target);
        binary_search(arr,target);




    }
}