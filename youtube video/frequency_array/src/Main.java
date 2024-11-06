import java.util.Scanner;

public class Main {
    static int[] frequency_array(int[] arr){
        int n = arr.length;
        int[] freq = new int[100004];
        for (int i = 0;i<n;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    //Write the program in java input the number of search element and search the element if it is say yes otherwise no?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,1,2,400,525,658,22};
        System.out.println("enter the search element :-");
        int query=sc.nextInt();
        int[] freq = frequency_array(arr);
        while(query>0){
            System.out.println("enter the search element:-");
            int q = sc.nextInt();
            if (freq[q]>0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            query--;
        }

    }
}