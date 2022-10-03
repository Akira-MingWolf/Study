package Lecture5;
import java.util.Scanner;
public class EX1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0; // initialization
        do {
            System.out.print("The sum is now " + sum + ". Please input an integer (Type 0 to quit) : ");
            int i = input.nextInt(); // i = integer
            if (i != 0) {
                sum += i; // increment
            } else { // if type 0 then end
                System.out.print("The sum is " + sum + ".");
                break;
            }

        } while (true); // looping condition
    }
}
