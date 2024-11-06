public class evendigitscount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 789, 45, 233364};
        System.out.println(even(arr));
        System.out.println();

    }
    static int even(int[] arr) {
        int count = 0;
        for (int a : arr) {
            if (find(a)){
                count++;
            }

        }
        return count;



    }

    private static boolean find(int a) {
        int count=0;
        while (a>0){
            count++;
            a=a/10;

        }
        if (count%2==0){
            return true;
        }
        return false;
    }

}

