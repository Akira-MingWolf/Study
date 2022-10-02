package Lecture3;
import java.util.Scanner;
public class EX3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input an integer between 2 to 10 : ");
        int integer = input.nextInt();
        System.out.print(integer);
        switch (integer) {
            case 2:
            case 3:
            case 5:
            case 7:
                System.out.println(" is a prime number");
                break;
            case 4:
            case 6:
            case 8:
            case 9:
            case 10:
                System.out.println(" is a composite number");
                break;
            default:
                System.out.println(" is outside the range of 2 to 10");
        }
    }
}
