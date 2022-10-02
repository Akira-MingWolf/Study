package Lecture3;
import java.util.Scanner;
public class EX4 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the month (1-12) : ");
        int month = input.nextInt();
        int totalDays = 0;
        if (month >= 1 && month <= 12) {
            switch (month) {
                case 12:
                    totalDays += 31;
                case 11:
                    totalDays += 30;
                case 10:
                    totalDays += 31;
                case 9:
                    totalDays += 30;
                case 8:
                    totalDays += 31;
                case 7:
                    totalDays += 31;
                case 6:
                    totalDays += 30;
                case 5:
                    totalDays += 31;
                case 4:
                    totalDays += 30;
                case 3:
                    totalDays += 31;
                case 2:
                    totalDays += 28;
                case 1:
                    totalDays += 31;
            }
            System.out.println("The total number of days is " + totalDays);
        } else {
            System.out.println("Please enter a number between 1 and 12");
        }
    }
}
