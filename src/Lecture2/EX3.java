package Lecture2;
import java.util.Scanner;
public class EX3 {
    public static void main (String[] args) {
//input
        Scanner input = new Scanner(System.in);

        System.out.print("What is the temperature in Celsius? ");
        int temp = input.nextInt();
//logic + output
        if (temp < 0) {
            System.out.print("It is freezing!");
        } else if (temp < 15) {
            System.out.print("It is cold");
        } else if (temp < 25) {
            System.out.print("It is warm");
        } else {
            System.out.print("It is hot");
        }
    }
}