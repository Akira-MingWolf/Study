package Lecture5;
import java.util.Scanner;
public class EX5 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of the stair (1 to 9): ");
        int size = input.nextInt();

        for (int i = 1       ;i <= size       ;i ++       ) {
            for (int j = 1       ;j <= (size - i)       ;j ++       ) {
                System.out.print(size);
            }
            for (int j = 1      ;j <= i        ;j ++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
