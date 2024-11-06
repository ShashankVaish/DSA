import java.util.Scanner;

public class repeat_character {
    static void remove_occurence(String s, int idx){
        if (s.length()==0){

        }
    }
    static String rp(String s){
        String ans ="";
        if (s.length()==0){
            return s;
        }
        int idx =0;

        // base case
        String smallans=rp(s.substring(idx+1));
        if (s.charAt(idx)==s.charAt(idx+1)){
            return (smallans+"*"+s.substring(idx));
        }
        return (smallans+s.substring(idx));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        String kol=rp(k);
        System.out.println(kol);

    }
}
