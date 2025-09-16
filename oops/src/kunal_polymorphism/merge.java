package kunal_polymorphism;

public class merge {
    static void mergesort(int[] arr,int left,int right){
        if(left<right){
            int mid = (left+right)/2;
            mergesort(arr,left,mid);
            mergesort(arr,mid+1,right);
            merge(arr,left,mid,right);

        }
    }
    static void merge(int[] arr,int left,int mid,int right){
        int n1 = mid-left+1;
        int n2 = right-mid;
        int[] l1 = new int[n1];
        int[] l2 = new int[n2];
        for(int i =0;i<n1;i++){
            l1[i]=arr[left+i];

        }
        for(int j =0;j<n2;j++){
            l2[j]=arr[mid+j+1];

        }
        int i =0,j=0,k=left;
        while(i<n1 && j<n2){
            if(l1[i]<l2[j]){
                arr[k]=l1[i];
                i++;
            }
            else{
                arr[k]=l2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=l1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=l2[j];
            j++;
            k++;
        }



    }

    public static void main(String[] args) {
        int[] arr = {8,6,3,9,1};
        mergesort(arr,0,arr.length-1);
        for(int num:arr){
            System.out.println(num);
        }

    }
}
