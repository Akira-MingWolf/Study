package Lecture3;

public class EX0 {
    public static void main (String[] args) {
//Q1
        int a = 40;
        String A;
        A = a < 50 ? "fail" : "pass";
        System.out.println(a + " is " + A);
//Q2
        double b = 5.0;
        String B;
        B = b < 10.5 ? "cheap" : "expensive";
        System.out.println(b + " is " + B);
//Q3
        int c = 10;
        String C;
        C = c > 28 ? "hot" : "warm";
        System.out.println(c + " is " + C);
//Q4
        String d = "-";
        String D;
        D = (d.equals("+")) ? "+1" : "-1";
        System.out.println(d + " is " + D);
//Q5
        String e = "not_good";
        String E;
        E = (e.equals("ok")) ? "y" : "n";
        System.out.println(e + " is " + E);
//Q6
        String f = "F";
        String F;
        F = (f.equals("M")) ? "Male" : "Female";
        System.out.println(f + " is " + F);
//Q7
        double g = 3.5;
        String G;
        double difference = g - Math.round(g);
        G = difference == 0 ? "integer" : "decimal number";
        System.out.println(g + " is " + G);
    }
}
