public class array {
    static int sum_of_array(int[] arr,int idx){
        if (idx == arr.length-1) return arr[idx];
        return arr[idx]+sum_of_array(arr,idx+1);
    }
    static void print_array(int[] arr,int count){
        if (count==arr.length) return;
        System.out.println(arr[count]);

        print_array(arr,count+1);

    }
    static int max_num_array(int[] arr,int idx){
        if (idx==arr.length-1) return arr[idx];
        int samllans = max_num_array(arr,idx+1);
        return Math.max(arr[idx],samllans);
    }
    public static void main(String[] args) {
        int[] arr = {7,8,6,5,9,9,4};
        print_array(arr,0);
        System.out.println("these max element in array");
        int max = max_num_array(arr,0);
        System.out.println(max);
        int sum = sum_of_array(arr,0);
        System.out.println("the sum of the array is :-" +sum);

    }
}
