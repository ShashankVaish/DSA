public class selection_sort {
    static int[] practice(int[] arr){
        int n = arr.length;
        int min_index = 0;
        for (int i = 0;i<n-1;i++){
            for (int j = i+1;j<n-1;j++){
                if (arr[min_index]>arr[j]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[min_index];
            arr[min_index]= temp;
        }
        return arr;
    }
    static int[] sort(int[] s){
        int n = s.length;
        for (int i =0;i<n-1;i++){
            int min_index=i;
            for (int j = i+1;j<n;j++){
                if (s[j]<s[min_index]){
                    min_index=j;
                }
            }
            int temp = s[i];
            s[i]= s[min_index];
            s[min_index]=temp;
        }
        return s;
    }
    public static void main(String[] args) {
        int[] arr  ={5,7,2,10};
        int[] ans = practice(arr);
        for (int i =0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }


    }
}
