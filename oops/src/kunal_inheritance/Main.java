package kunal_inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//        System.out.println(box.l +" "+box.h+" "+box.w);
        box_weight box = new box_weight(9.0,8.8,9.0,8.6);
        box_weight box1 = new box_weight(box);

        System.out.println(box1.h +" "+box1.weight);

    }

}
