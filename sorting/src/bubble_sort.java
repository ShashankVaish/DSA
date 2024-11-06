public class bubble_sort {
    static int[] bubble_sort(int[] s){
        int n =s.length;
        for (int i =0;i<n-1;i++){
            for (int j =0;j<n-i-1;j++){
                if (s[j]>s[j+1]){
                    int temp = s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
        return s;
    }
    static int[] optimised_buble_sort(int[] s ){
        int n = s.length;
        for (int i =0;i<n-1;i++){
            boolean flag = false;
            for (int j = 0;j<n-i-1;j++){
                if (s[j]>s[j+1]){
                    int temp = s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                    flag = true;

                }
            }
            if(!flag){
                return s;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int[] s = {2,1,3,4,5};
//        int[] arr = bubble_sort(s);
        int[] arr = optimised_buble_sort(s);
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
