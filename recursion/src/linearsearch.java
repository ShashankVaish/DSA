import java.util.ArrayList;
import java.util.Scanner;

public class linearsearch {
    // take all indices in arraylist
    static ArrayList<Integer> indices_in_element(int[] arr,int target,int idx){
        if (idx== arr.length) return new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        if (arr[idx]==target) ans.add(idx);
        ArrayList<Integer> smallans = indices_in_element(arr,target,idx+1);
        ans.addAll(smallans);
        return ans;

    }
    // print all the indices of traget value

    static void alldiffrentindices(int[] arr,int target,int idx){
        if (idx>= arr.length) return;
        if (arr[idx]==target){
            System.out.println(idx);
        }
        alldiffrentindices(arr,target,idx+1);

    }
    // for the target value present in array so return true
    static boolean linear_search(int[] arr,int target,int idx){
        if (idx>=arr.length) return false;
        if (arr[idx] == target) return true;
        return linear_search(arr,target,idx+1);


    }
    public static void main(String[] args) {
        int[] arr = {4,8,4,5,74,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target value");
        int target  = sc.nextInt();
        if (linear_search(arr,target,0)){
            System.out.println("yes");
            System.out.println("the diffrent indices are");
            alldiffrentindices(arr,target,0);
        } else {
            System.out.println("no");
        }
        System.out.println("the array list ans print");
        ArrayList<Integer> ans = indices_in_element(arr,target,0);
        for (Integer i:ans){
            System.out.print(i+" ");
        }



    }
}
