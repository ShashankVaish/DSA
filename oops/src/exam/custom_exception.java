package exam;
class ageexception extends Exception{

    ageexception(String message){
        super(message);

    }
}
public class custom_exception {
    static boolean checkage(int age) throws ageexception{
        if(age<0){
            throw new ageexception("age can not be negative");
        }
        if(age>18){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        try {
            checkage(-90);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
