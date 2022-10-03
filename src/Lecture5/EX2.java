package Lecture5;
import java.util.Scanner;
public class EX2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int min = 0;
        do {
            System.out.print("Please input an integer (Type 0 to quit) : ");
            int i = input.nextInt(); // i = integer
            if (i == 0) { // type 0 then end
                break;
            }
            if (max == 0 && min == 0) { // prevent output 0
                max = i;
                min = i;
            } else {
                if (i < min) {
                    min = i;
                }
                if (i > max) {
                    max = i;
                }
            }
        } while (true);
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
    }
}
