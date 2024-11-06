import java.util.Scanner;

public class string {
    static String character_occurence_in_string(String s,int idx){
        if (idx==s.length()) return "";
        if (s.charAt(idx)=='a') return character_occurence_in_string(s,idx+1);
        else return s.charAt(idx)+character_occurence_in_string(s,idx+1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans="";

//        for (int i = 0;i<s.length();i++){
//            System.out.println(s.charAt(i));
//        }
//        System.out.println(s.substring(1,20));
        // question is remove the all occurence of a in string
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)!='a'){
                ans+=s.charAt(i);

            }
        }
        String vs = character_occurence_in_string(s,0);
        System.out.println(vs);

//        System.out.println(ans);
    }
}
