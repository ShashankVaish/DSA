import java.util.Scanner;

public class quick_sort {
    static void swap(int[] arr,int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static int pivotfunc(int[] arr,int st,int end){
        int pivot=arr[st];
        int count=0;
        for(int j=st+1;j<=end;j++){
            if(arr[j]<=pivot) count++;

        }
        int pivotidx = st+count;
        swap(arr,st,pivotidx);
        int i = st,j = end;
        while(i<pivotidx && j>pivotidx){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if (i<pivotidx && j>pivotidx) {
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotidx;


    }
    static void sort(int[] arr,int st,int end){
        if(st>=end) return;
        int pivot = pivotfunc(arr,st,end);
        sort(arr,st,pivot-1);
        sort(arr,pivot+1,end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//
//        }
        int[] arr1={12,7,8,13,9,10,67};
        sort(arr1,0,arr1.length-1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }

    }
}
