public class insertion {
    static int[] insertion_sort(int[] arr){
        int n = arr.length;
        for (int i = 1;i<n;i++){
            int j= i;
            while (j>0 && (arr[j]<arr[j-1])){
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return  arr;
    }
    public static void main(String[] args) {

        int[] arr = {5,2,8,6,10,11};
        int[] ans  = insertion_sort(arr);
        for (int value:ans){
            System.out.print(value+" ");
        }

    }
}
