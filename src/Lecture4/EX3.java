package Lecture4;
import java.util.Scanner;
public class EX3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer : ");
        int integer = input.nextInt();

        System.out.print("Please enter the number of rows of the multiplication table : ");
        int numOfRow = input.nextInt();

        int numOfRowCount;
        int ans;
        for (numOfRowCount = 1       ;numOfRowCount <= numOfRow       ;numOfRowCount ++) {
            ans = numOfRowCount * integer;
            System.out.println(numOfRowCount + " x " + integer + " = " + ans);
        }
    }
}
