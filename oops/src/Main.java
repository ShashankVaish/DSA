class employee{
    void fly(){
        System.out.println("hello ");
    }
    void swim(){
        System.out.println("you can swim");
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        employee e = new employee();
        e.fly();
        e.swim();

    }
}