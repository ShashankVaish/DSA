import java.util.Scanner;

public class reverse_string {
    static String reverse_string(String s,int idx){
        if (idx<0) return "";
        return s.charAt(idx)+reverse_string(s,idx-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = reverse_string(s,s.length()-1);
        System.out.println(ans);

    }
}
