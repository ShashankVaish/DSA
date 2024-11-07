import java.util.Scanner;

public class quick_sort {
    static int pivotfunc(int[] arr,int st,int end){
        int pivot = arr[st];
        int i = st;
        int j = end;
        int pivotLtc = 0;
        for (i = st;i<j;i++){
            if(arr[i]<pivot){
                pivotLtc++;
            }
        }
        int pivotindex = st+pivotLtc;
        int temp = arr[pivotindex];
        arr[pivotindex] = arr[i];
        arr[i] = temp;

    }
    static void sort(int[] arr,int st,int end){
        int pivot = pivotfunc(arr,st,end);
        sort(arr,st,pivot-1);
        sort(arr,pivot+1,end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        sort(arr,0,arr.length);
    }
}
