package Lecture1;

public class EX5 {
    public static void main (String[] args) {
        int loan = 20000;
        int year = 5;
        double rate = 2.75;
        double payment = loan * Math.pow((1 + rate/100),year);
        double interest = payment - loan;

        System.out.println("The loan is $" + loan);
        System.out.println("The term is " + year + " years");
        System.out.printf("The interest rate is %%%.2f\n", rate);
        System.out.printf("The total payment is $%.2f\n", payment);
        System.out.printf("The total interest is $%.2f\n", interest);
    }
}