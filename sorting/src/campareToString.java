public class campareToString {

    static void lol(String[] s){
        for(int i =0;i<s.length;i++){
            int min =i;
            for(int j = i+1;j<s.length;j++){
                if((s[min].compareTo(s[j]))>0){
                    String temp = s[j];
                    s[j]=s[min];
                    s[min]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String[] s = {"apple","papaya","banana","orange","shashank"};
        lol(s);
        for(String var:s){
            System.out.print(var+" ");
        }
    }
}
