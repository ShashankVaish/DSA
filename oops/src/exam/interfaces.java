package exam;
interface loud {
    void speakloud();
}
interface walk{
    void walkslow();
}
class huma implements loud,walk{
    @Override
    public void speakloud() {
        System.out.println(" i am speak in loud voice");
    }
    @Override
    public void walkslow(){
        System.out.println(" i am walk slow");
    }

}
public class interfaces {
    public static void main(String[] args) {
        huma obj = new huma();
        obj.speakloud();
        obj.walkslow();

    }
}
