public class merge_sort {
    static void practise_merge_sort(int[] arr,int l,int r){
        if(l>=r) return;
        int mid = (l+r)/2;
        practise_merge_sort(arr,l,mid);
        practise_merge_sort(arr,mid+1,r);
        practise_merge(arr,l,mid,r);
    }
    static void practise_merge(int[] arr,int l,int mid,int r){
        int n1 =  mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i,j,k;
        for(i = 0;i<n1;i++) left[i]=arr[l+i];
        for(j = 0;j<n2;j++) right[j]=arr[mid+j+1];
        i = 0;
        j = 0;
        k = l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];

        }
    }
    static void printarray(int[] arr){
        for (int val:arr){
            System.out.print(val+" ");
        }
    }
    static void merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i,j,k;


        for (i=0;i<n1;i++) left[i]=arr[l+i];
        for (i = 0 ;i<n2;i++) right[i]=arr[mid+i+1];
        k =l;
        j=0;
        i=0;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }else {
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }
    static void mergesort(int[] arr,int l,int r){
        if(l>=r) return;
        int mid = (l+r)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void main(String[] args) {
        int[] arr = {12,14,9,15,0,2};
        practise_merge_sort(arr,0,arr.length-1);
        printarray(arr);
    }
}
