public class quick_sort_practise {
    static void swap(int[] arr,int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void printArray(int[] arr){}
    static int pifunc(int[] arr, int st,int end){
        int pivot = arr[st];
        int count= 0;
        for (int i=st+1;i<=end;i++){
            if(arr[i]<pivot) count++;
        }
        int pivotindex = st+count;
        swap(arr,pivotindex,st);
        int i  = st,j = end;
        while(i <pivotindex && j>pivotindex){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if(i <pivotindex && j>pivotindex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotindex;
    }
    static void sort(int[] arr,int st,int end){
        if(st>end) return;
        int pivot= pifunc(arr,st,end);
        sort(arr,st,pivot-1);
        sort(arr,pivot+1,end);
    }
    public static void main(String[] args) {

        int[] arr = {12,78,3,9,0,23};
        sort(arr,0,arr.length-1);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
