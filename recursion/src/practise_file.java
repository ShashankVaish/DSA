public class practise_file {
    static int gcd_by_euclid(int x,int y){
        if (y==0){
            return x;
        }
        return gcd_by_euclid(y,x%y);
    }
    static int gcd_by_longdivision(int x,int y){
        while (x%y!=0){
            int reminder = x%y;
            x = y;
            y = reminder;
        }
        return y;
    }

    static int gcd_bekar_approch(int x,int y ){
        int gcd = 1;
        for (int i=1;i<=x&&i<=y;i++){
            if (x%i==0 && y%i==0){
                gcd = i;

            }
        }
        return gcd;

    }
    static void kmultiples(int p,int q){
        // base case
        if (q==0){
            return;
        }
        //recursive work
        kmultiples(p,q-1);
        //self work
        System.out.print(p*q+",");





    }
    static int sumofelement(int n){
        if (n == 0) return 0;
        int ans =sumofelement(n-1)+n;
        return ans;
    }
    static int alternate_series(int n){
        if (n==0) return 0;
        if (n%2==0) return alternate_series(n-1)-n;
        else return alternate_series(n-1)+n;
    }
    public static void main(String[] args) {
//        kmultiples(5, 3);
//        System.out.println(sumofelement(16));
//        System.out.println(alternate_series(5));
//        System.out.println(gcd_bekar_approch(12,16));
//        System.out.println(1<=12&&1<=16);
        System.out.println(gcd_by_euclid(17,19));


        

    }
}
