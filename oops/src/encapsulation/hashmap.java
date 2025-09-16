package encapsulation;
import java.net.Inet4Address;
import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(101,"sashank");
        hashmap.put(102,"indane");
        System.out.println("the hashmap is  like "+ hashmap);
        HashMap<Integer,String> bh = (HashMap<Integer, String>) hashmap.clone();
        System.out.println(hashmap.equals(bh));
    }
}
