package Lecture4;

public class EX1 {
    public static void main (String[] args) {
        //while loop
        System.out.println("While-loop");
        System.out.print("Integers : ");
        int i = 10; // Initialization
        while (i <= 15) { // looping condition
            System.out.print(i + " ");
            i ++; // Increment
        }
        System.out.println(); // skip line
        System.out.print("Even : ");
        int i1 = 10; // Initialization
        while (i1 <= 15) { // looping condition
            System.out.print(i1 + " ");
            i1 += 2; // Increment
        }
        System.out.println(); // skip line
        System.out.print("Odd : ");
        int i2 = 11; // Initialization
        while (i2 <= 15) { // looping condition
            System.out.print(i2 + " ");
            i2 += 2; // Increment
        }


        // do-while loop
        System.out.println(); // skip line
        System.out.println("Do-while loop");
        System.out.print("Integers : ");
        int i3 = 10; // Initialization
        do {
            System.out.print(i3 + " ");
            i3 ++; // Increment
        } while (i3 <= 15); // looping condition
        System.out.println(); // skip line
        System.out.print("Even : ");
        int i4 = 10; // Initialization
        do {
            System.out.print(i4 + " ");
            i4 += 2; // Increment
        } while (i4 <= 15); // looping condition
        System.out.println(); // skip line
        System.out.print("Odd : ");
        int i5 = 11; // Initialization
        do {
            System.out.print(i5 + " ");
            i5 += 2; // Increment
        } while (i5 <= 15); // looping condition


        // for loop
        System.out.println(); // skip line
        System.out.println("For-loop");
        System.out.print("Integers : ");
        int i6;
        for (i6 = 10       ; i6 <=15      ; i6 ++) { // Initialization + looping condition + Increment
            System.out.print(i6 + " ");
        }
        System.out.println(); // skip line
        System.out.print("Even : ");
        int i7;
        for (i7 = 10      ; i7 <= 15        ; i7 += 2) { // Initialization + looping condition + Increment
            System.out.print(i7 + " ");
        }
        System.out.println(); // skip line
        System.out.print("Odd : ");
        int i8;
        for (i8 = 11       ; i8 <=15      ; i8 += 2) { // Initialization + looping condition + Increment
            System.out.print(i8 + " ");
        }
    }
}
