package abstraction;

public class son extends parent{
    @Override
    public void career(){
        System.out.println("i want beacome a doctor");
    }
    public void partnar(){
        System.out.println(" i love kissa sins");
    }

    public static void main(String[] args) {
        son obj = new son();
        obj.career();
        obj.partnar();
    }
}

