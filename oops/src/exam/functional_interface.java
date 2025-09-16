package exam;
import java.util.*;
@FunctionalInterface
interface a {
    void show();

}
public class functional_interface {
    public static void main(String[] args) {
        a obj = new a(){
            public void show(){
                System.out.println("hello");
            }
        };
        obj.show();

    }

}
