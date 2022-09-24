package Lecture2;
import java.util.Scanner;
public class EX1 {
    public static void main (String[] args) {
//input
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.next();

        System.out.print("What is your monthly salary? ");
        int salary = input.nextInt();

        System.out.print("What are your monthly expenses? ");
        int spent = input.nextInt();
//calculation
        int year_salary = salary * 12;
        int year_spent = spent * 12;
        int year_save = year_salary - year_spent;
        int ten_year_save = year_save * 10;
//output
        System.out.printf(name + ", you have total income $" + year_salary + " per year");
        System.out.printf("\nYou spent $" + year_spent + " per year");
        System.out.printf("\nYou can save $" + year_save + " per year");
        System.out.printf("\nAfter 10 years, you can save $" + ten_year_save);
    }
}