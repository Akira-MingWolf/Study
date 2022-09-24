package Lecture3;
import java.util.Scanner;
public class EX0 {
    public static void main (String[] args) {
//input
        Scanner input = new Scanner(System.in);
//Q1
        System.out.print("What is your score? ");
        int a = input.nextInt();
        String A;
        A = a < 50 ? "fail" : "pass";
        System.out.printf(a + " is " + A);
//Q2
        System.out.print("\nWhat is the price? ");
        double b = input.nextDouble();
        String B;
        B = b < 10.5 ? "cheap" : "expensive";
        System.out.printf(b + " is " + B);
//Q3
        System.out.print("\nWhat is the temperature? ");
        int c = input.nextInt();
        String C;
        C = c > 28 ? "hot" : "warm";
        System.out.printf(c + " is " + C);
//Q4
        System.out.print("\nWhat is the label? ");
        String d = input.next();
        String D;
        D = (d.equals("+")) ? "+1" : "-1";
        System.out.printf(d + " is " + D);
//Q5
        System.out.print("\nWhat is the word? ");
        String e = input.next();
        String E;
        E = (e.equals("ok")) ? "y" : "n";
        System.out.printf(e + " is " + E);
//Q6
        System.out.print("\nWhat is the gender? ");
        String f = input.next();
        String F;
        F = (f.equals("M")) ? "Male" : "Female";
        System.out.printf(f + " is " + F);
//Q7
        System.out.print("\nWhat is number");
        double g = input.nextDouble();
        String G;
        double difference = g - Math.round(g);
        G = difference == 0 ? "integer" : "decimal number";
        System.out.printf(g + " is " + G);
    }
}
