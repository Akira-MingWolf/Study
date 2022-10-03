package Lecture5;
import java.util.Scanner;
public class EX3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of the square : ");
        int size = input.nextInt();

        for (int i = 1       ;i <= size       ;i ++       ) {
            for (int j = 1       ;j <= size       ;j ++       ) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
