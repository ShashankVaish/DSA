import java.util.Scanner;

public class arr_problem_1 {
    static void odd_array(int n ,int oddcount){


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evencount = 0;
        int oddcount = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evencount++;

            } else {
                oddcount++;
            }
        }

        int j = 0;
        int l = arr.length-1;
        for (int i = 1; i < n+1; i++) {
            if (i % 2 == 0) {
                arr[l] = i;
                l--;

            } else {
                arr[j] = i;
                j++;
            }

        }


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
