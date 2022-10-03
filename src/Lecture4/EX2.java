package Lecture4;

public class EX2 {
    public static void main (String[] args) {
        //using while loop
        System.out.println("Using while-loop");
        System.out.print("The sum of ");
        int i = 10; // Initialization
        int Ans = 0;
        while (i <= 50) { // looping condition
            System.out.print(i + " ");
            Ans += i; // Increment
            i += 10;
        }
        System.out.print("is " + Ans + "\n");

        // using do while loop
        System.out.println("Using do-while loop");
        System.out.print("The sum of ");
        int i1 = -6; // Initialization
        int Ans1 = 0;
        do {
            System.out.print(i1 + " ");
            Ans1 += i1; // Increment
            i1 --;
        } while (i1 >= -10); // looping condition
        System.out.print("is " + Ans1 + "\n");

        // using for loop
        System.out.println("Using for-loop");
        System.out.print("The average of ");
        int i2;
        double Ans3 = 0;
        for (i2 = 110     ; i2 <= 125       ; i2 += 5) { // Initialization + looping condition + Increment
            System.out.print(i2 + " ");
            Ans3 += i2;
        }
        System.out.print("is " + Ans3/4);
    }
}
