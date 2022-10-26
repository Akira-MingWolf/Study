package Lecture8;

public class EX1 {
    // Print the area of a square with length
    public static void squareArea(int l) {
        int ans = l * l;
        System.out.println("Area of a square with length " + l + " is " + ans);
    }

    // Print the area of a triangle with base and height
    public static void triangleArea(double b, double h) {
        double ans = (b * h)/2.0;
        System.out.println("Area of a triangle with base " + b + " and height " + h + " is " + ans);
    }

    // Subtract two numbers. Return the answer
    public static int subtract (int a, int b) {
        int ans = a - b;
        return ans;
    }
    // Multiply three numbers. Return the answer
    public static int multiply (int a, int b, int c) {
        int ans = a * b * c;
        return ans;
    }
    // Find the maximum of two double numbers
    public static double max (double a, double b) {
        return a > b ? a : b;
    }
    // Find the maximum of two integer numbers
    public static int max (int a, int b) {
        return a > b ? a : b;
    }


    public static void main (String[] args) {
        squareArea(4); // Area of a square with length 4 is 16
        triangleArea(3.0, 4.0); // Area of a triangle with base 3.0
        // and height 4.0 is 6.0
        int a = 10, b = 100;
        int c = subtract (b, a); // b - a
        System.out.println(b + " - " + a + " = " + c); // 100 - 10 = 90
        int m = multiply (a, b, 10); // a * b * 10
        System.out.println(a + " x " + b + " x " + 10 + " = " + m);
        int p = max(4,5); // Find the maximum
        System.out.println("The maximum of 4 and 5 is " + p);

        double q = max(3.14, 3.0); // Find the maximum
        System.out.println("The maximum of 3.14 and 3.0 is " + q);
    }
}
