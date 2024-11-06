import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class practise {
    static void reverse(ArrayList<Integer> list){
        int i = 0 ,j = list.size()-1;
        while(i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;

        }
        System.out.println(list);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("original list ");
        System.out.println(list);
        System.out.println("reverse of the list ");
//        reverse(list);
        Collections.reverse(list);
        System.out.println("reverse by using collection "+list);
        Collections.sort(list);
        System.out.println("asscending order"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("descending order"+list);


    }
}
