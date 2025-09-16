package encapsulation;
import java.util.*;
public class IteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Shyam");
        names.add("Mohan");

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String name = it.next();


            System.out.println(name);
        }
    }
}
