package exam;

public class switch_as_expression{
    public static void main(String[] args) {
        String day = "monday";
        String result = "";
        result  = switch(day){
            case "monday","sunday": yield "11am";
            case "saturday":yield "9am";
            default: yield "5am";


        };
        System.out.println(result);
    }
}
