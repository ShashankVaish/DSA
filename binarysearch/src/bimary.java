import java.util.Scanner;

public class bimary {

    static int[] insertionsor(int[] arr){
        for (int i = 0;i<arr.length-1;i++){
            for (int j = i+1;j>0;j--){
                if (arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;

                }
                else{
                    break;
                }
            }

        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,2,4,9,8};
        int start = 0;
        int target = 15;
        int end = arr.length-1;

        while(start<end){
            int mid = (start+end)/2;
            if (target>arr[mid]){

                start = mid+1;

            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                System.out.println(mid+1);
                break;
            }

        }
        int[] a = insertionsor(arr);
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
