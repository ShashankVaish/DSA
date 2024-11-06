import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
//        Integer i = Integer.valueOf(5);
//        System.out.println(i);
        ArrayList<Integer> l1 = new ArrayList<>();
        // adding element
        l1.add(5);
        l1.add(6);
        System.out.println(l1);
        // print by the loop
//        for (int i = 0 ;i<l1.size();i++){
//            System.out.println(l1.get(i));
//        }
        // adding elemnt at i index
        l1.add(0,100);
        System.out.println(l1);


    }
}