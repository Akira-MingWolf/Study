package Lecture8;

public class EX3 {
    // Method : printRect
    public static void printRect(int a , int b , char c) {
        for (int i = 0       ;i < a       ;i ++       ) {
            for (int j = 0       ;j < b       ;j ++       ) {
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println("The length is " + a);
        System.out.println("The width is " + b);
        System.out.println("The area is " + (a * b));
        System.out.println();
    }

    public static void main (String[] args) {
        printRect (2, 5, '*');
// *****
// *****
// The length is 2
// The width is 5
// The area is 10
        printRect (3, 4, '+');
// ++++
// ++++
// ++++
// The length is 3
// The width is 4
// The area is 12
    }
}
