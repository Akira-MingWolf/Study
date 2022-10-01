package Lecture4;

public class EX1 {
    public static void main (String[] args) {
        //while loop
        System.out.println("While-loop");
        System.out.print("Integers : ");
        int whileLoopIntegerCount = 10;
        while (whileLoopIntegerCount <= 15) {
            System.out.print(whileLoopIntegerCount + " ");
            whileLoopIntegerCount ++;
        }
        System.out.println(); //
        System.out.print("Even : ");
        int whileLoopEvenCount = 10;
        while (whileLoopEvenCount <= 15) {
            System.out.print(whileLoopEvenCount + " ");
            whileLoopEvenCount += 2;
        }
        System.out.println(); //
        System.out.print("Odd : ");
        int whileLoopOddCount = 11;
        while (whileLoopOddCount <= 15) {
            System.out.print(whileLoopOddCount + " ");
            whileLoopOddCount += 2;
        }
        // do-while loop
        System.out.println(); //
        System.out.println("Do-while loop");
        System.out.print("Integers : ");
        int doWhileLoopIntegerCount = 10;
        do {
            System.out.print(doWhileLoopIntegerCount + " ");
            doWhileLoopIntegerCount ++;
        } while (doWhileLoopIntegerCount <= 15);
        System.out.println(); //
        System.out.print("Even : ");
        int doWhileLoopEvenCount = 10;
        do {
            System.out.print(doWhileLoopEvenCount + " ");
            doWhileLoopEvenCount += 2;
        } while (doWhileLoopEvenCount <= 15);
        System.out.println(); //
        System.out.print("Odd : ");
        int doWhileLoopOddCount = 11;
        do {
            System.out.print(doWhileLoopOddCount + " ");
            doWhileLoopOddCount += 2;
        } while (doWhileLoopOddCount <= 15);
        // for loop
        System.out.println(); //
        System.out.println("For-loop");
        System.out.print("Integers : ");
        int forLoopIntegerCount;
        for (forLoopIntegerCount = 10       ; forLoopIntegerCount <=15      ; forLoopIntegerCount ++) {
            System.out.print(forLoopIntegerCount + " ");
        }
        System.out.println(); //
        System.out.print("Even : ");
        int forLoopEvenCount;
        for (forLoopEvenCount = 10      ; forLoopEvenCount <= 15        ; forLoopEvenCount += 2) {
            System.out.print(forLoopEvenCount + " ");
        }
        System.out.println(); //
        System.out.print("Odd : ");
        int forLoopOddCount;
        for (forLoopOddCount = 11       ; forLoopOddCount <=15      ; forLoopOddCount += 2) {
            System.out.print(forLoopOddCount + " ");
        }
    }
}
