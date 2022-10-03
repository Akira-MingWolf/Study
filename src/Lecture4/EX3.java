package Lecture4;
import java.util.Scanner;
public class EX3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer : ");
        int integer = input.nextInt();

        System.out.print("Please enter the number of rows of the multiplication table : ");
        int numOfRow = input.nextInt();

        int i = 1;
        int ans;
        for (       ;i <= numOfRow       ;i ++) {
            ans = i * integer;
            System.out.println(i + " x " + integer + " = " + ans);
        }
    }
}
