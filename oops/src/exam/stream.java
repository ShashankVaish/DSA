package exam;
import java.util.*;
public class stream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,2,1,9,6);
        nums.stream()
                .filter(n ->n%2==0)
                .map(n->n*2)
                .forEach(System.out::println);


    }
}
