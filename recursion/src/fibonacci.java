public class fibonacci {
    static int aly(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        return aly(n-1)+aly(n-2);
    }
    public static void main(String[] args) {
        System.out.println("the factorial"+aly(5));

    }
}
