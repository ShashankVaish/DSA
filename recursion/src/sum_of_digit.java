public class sum_of_digit {
    static int lol(int n){
        if(n==0||n==1) return n;
        return lol(n/10)+n%10;

    }
    static int countnumber(int p,int q){
        if (q==0) return 1;
        return countnumber(p,q-1)*p;






    }
    static int raisedpower(int p,int q)  {
        if (q==0) return 1;
        if (q%2==0) return raisedpower(p,q/2)*raisedpower(p,q/2);
        return raisedpower(p,q/2)*raisedpower(p,q/2)*p;
    }
    public static void main(String[] args) {
        System.out.println("the answer "+raisedpower(5,2));

    }
}
