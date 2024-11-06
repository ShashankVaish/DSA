import java.util.ArrayList;
import java.util.Scanner;

public class subset_of_string_in_arraylist {
    static ArrayList<String> sq(String s){
        ArrayList<String> ans = new ArrayList<>();
        // base case
        if (s.length()==0){
            ans.add("");
            return ans;

        }
        char currs = s.charAt(0);
        // small work
        ArrayList<String> smallans = sq(s.substring(1));
        for (String ss:smallans){
            ans.add(ss);
            ans.add(currs+ss);


        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> ans= sq(s);
        System.out.println(ans);

    }
}
