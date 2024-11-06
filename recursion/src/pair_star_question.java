import java.util.Scanner;

/*Pair star

Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
Input format :
String S
Output format :
Modified string
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
hello
Sample Output 1:
hel*lo
Sample Input 2 :
aaaa
Sample Output 2 :
a*a*a*a
*/
public class pair_star_question {
    static String pairstar(String s,int l,int r){
        if (r==s.length()) return"";
        if (s.charAt(l)==s.charAt(r)) return s.substring(0,l)+"*"+pairstar(s,l+1,r+1);
        return pairstar(s,l+1,r+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = pairstar(s,0,1);
        System.out.println(ans);

    }
}

