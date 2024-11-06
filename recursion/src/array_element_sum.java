import java.util.Scanner;
public class array_element_sum {
    static int sum_array_element(int[] arr,int num){
        if (num == arr.length){
            return num;
        }
        return arr[num]+sum_array_element(arr,num+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = sum_array_element(arr,0);
        System.out.println(sum);
    }
}
