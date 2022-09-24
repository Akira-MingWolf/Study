package Lecture2;
import java.util.Scanner;
public class EX5 {
    public static void main (String[] args) {
//input
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int x = input.nextInt();
//logic
        boolean five = (x % 5) == 0;
        boolean six = (x % 6) == 0;

        if (five && six) {
            System.out.printf(x + " is divisible by both 5 and 6\n");
        } else if (five) {
            System.out.printf(x + " is divisible by 5\n");
        } else if (six) {
            System.out.printf(x + " is divisible by 6\n");
        } else {
            System.out.printf(x + " is not divisible by 5 or 6\n");
        }
    }
}
