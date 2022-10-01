package Lecture4;

public class EX2 {
    public static void main (String[] args) {
        //using while loop
        System.out.println("Using while-loop");
        System.out.print("The sum of ");
        int whileLoopCount = 10;
        int whileLoopAns = 0;
        while (whileLoopCount <= 50) {
            System.out.print(whileLoopCount + " ");
            whileLoopAns += whileLoopCount;
            whileLoopCount += 10;
        }
        System.out.print("is " + whileLoopAns + "\n");

        // using do while loop
        System.out.println("Using do-while loop");
        System.out.print("The sum of ");
        int doWhileLoopCount = -6;
        int doWhileLoopAns = 0;
        do {
            System.out.print(doWhileLoopCount + " ");
            doWhileLoopAns += doWhileLoopCount;
            doWhileLoopCount --;
        } while (doWhileLoopCount >= -10);
        System.out.print("is " + doWhileLoopAns + "\n");

        // using for loop
        System.out.println("Using for-loop");
        System.out.print("The average of ");
        int forLoopCount;
        double forLoopAns = 0;
        for (forLoopCount = 110     ; forLoopCount <= 125       ; forLoopCount += 5) {
            System.out.print(forLoopCount + " ");
            forLoopAns += forLoopCount;
        }
        System.out.print("is " + forLoopAns/4);
    }
}
