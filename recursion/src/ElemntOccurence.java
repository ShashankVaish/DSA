import java.util.Scanner;

public class ElemntOccurence {
    static String occurence(String s,int idx){
        if (idx==s.length()) return "";
        String ans = occurence(s,idx+1);
        char curchar = s.charAt(idx);
        if (curchar!='a'){
            return curchar+ans;
        }else{
            return ans;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = occurence(s,0);
        System.out.println(ans);

    }
}
