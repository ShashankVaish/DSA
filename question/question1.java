public class question1 {
    static void arraycountoccurence(int[] arr){
        int[] freq = new int[1000004];
        for (int i = 0;i<= arr.length;i++){
            freq[arr[i]]++;

        }
        for (int i = 0;i<= arr.length;i++){
            System.out.println(" the element of the repitation");
            System.out.println(freq[arr[i]]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,5,4,6,1,1,2};
        arraycountoccurence(arr);


    }
}
