public class subset_of_string_not {
    static void sscstring(String s,String currans){
        // base case
        if (s.length()==0){
            System.out.println(currans);
            return;
        }
        char curr = s.charAt(0);
        String remString=s.substring(1);
        // curr add
        sscstring(remString,currans+curr);
        // curr not aded
        sscstring(remString,currans);
    }
    public static void main(String[] args) {
        sscstring("shashank","");

    }
}
