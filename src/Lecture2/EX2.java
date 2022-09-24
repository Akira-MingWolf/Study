package Lecture2;
import java.util.Scanner;
public class EX2 {
    public static void main (String[] args) {
//input
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the loan amount : " );
        double loan = input.nextDouble();

        System.out.print("Please enter the annual interest rate : ");
        double interest = input.nextDouble();

        System.out.print("Please enter the number of years : ");
        double year = input.nextDouble();
//calculation
        double total_payment = loan * Math.pow((1 + interest/100),year);
        double total_interest = total_payment - loan;
//output
        System.out.printf("The total payment is $%.2f" , total_payment);
        System.out.printf("\nThe total interest is $%.2f" , total_interest);
    }
}