package Lecture4;

public class EX1 {
    public static void main (String[] args) {
        //while loop
        System.out.println("While-loop");
        System.out.print("Integers : ");
        int whileLoopIntegerCount = 10; // Initialization
        while (whileLoopIntegerCount <= 15) { // looping condition
            System.out.print(whileLoopIntegerCount + " ");
            whileLoopIntegerCount ++; // Increment
        }
        System.out.println(); // skip line
        System.out.print("Even : ");
        int whileLoopEvenCount = 10; // Initialization
        while (whileLoopEvenCount <= 15) { // looping condition
            System.out.print(whileLoopEvenCount + " ");
            whileLoopEvenCount += 2; // Increment
        }
        System.out.println(); // skip line
        System.out.print("Odd : ");
        int whileLoopOddCount = 11; // Initialization
        while (whileLoopOddCount <= 15) { // looping condition
            System.out.print(whileLoopOddCount + " ");
            whileLoopOddCount += 2; // Increment
        }


        // do-while loop
        System.out.println(); // skip line
        System.out.println("Do-while loop");
        System.out.print("Integers : ");
        int doWhileLoopIntegerCount = 10; // Initialization
        do {
            System.out.print(doWhileLoopIntegerCount + " ");
            doWhileLoopIntegerCount ++; // Increment
        } while (doWhileLoopIntegerCount <= 15); // looping condition
        System.out.println(); // skip line
        System.out.print("Even : ");
        int doWhileLoopEvenCount = 10; // Initialization
        do {
            System.out.print(doWhileLoopEvenCount + " ");
            doWhileLoopEvenCount += 2; // Increment
        } while (doWhileLoopEvenCount <= 15); // looping condition
        System.out.println(); // skip line
        System.out.print("Odd : ");
        int doWhileLoopOddCount = 11; // Initialization
        do {
            System.out.print(doWhileLoopOddCount + " ");
            doWhileLoopOddCount += 2; // Increment
        } while (doWhileLoopOddCount <= 15); // looping condition


        // for loop
        System.out.println(); // skip line
        System.out.println("For-loop");
        System.out.print("Integers : ");
        int forLoopIntegerCount;
        for (forLoopIntegerCount = 10       ; forLoopIntegerCount <=15      ; forLoopIntegerCount ++) {
            System.out.print(forLoopIntegerCount + " ");
        }
        System.out.println(); // skip line
        System.out.print("Even : ");
        int forLoopEvenCount;
        for (forLoopEvenCount = 10      ; forLoopEvenCount <= 15        ; forLoopEvenCount += 2) {
            System.out.print(forLoopEvenCount + " ");
        }
        System.out.println(); // skip line
        System.out.print("Odd : ");
        int forLoopOddCount;
        for (forLoopOddCount = 11       ; forLoopOddCount <=15      ; forLoopOddCount += 2) {
            System.out.print(forLoopOddCount + " ");
        }
    }
}
