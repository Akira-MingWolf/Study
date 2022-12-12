package Enum;
import java.util.*;
public class EX1 {
    enum weekday {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    };
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        weekday[] weekdays = weekday.values();
        System.out.print("Please input 0 to 6 : ");
        int i = input.nextInt();
        weekday day = weekdays[i];
        switch (day) {
            case SUNDAY :
            case SATURDAY : System.out.println(day + " is weekend");
                break;
            default : System.out.println(day + " is weekday");
                break;
        }
    }
}
