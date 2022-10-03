package Lecture5;
import java.util.Scanner;
public class EX6 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of the stair (1 to 9): ");
        int size = input.nextInt();

        for (int i = size       ;i >= 1       ;i --       ) {
            for (int j = i       ;j < size       ;j ++       ) {
                System.out.print(" ");
            }
            for (int j = i       ;j >= 1       ;j --       ) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
