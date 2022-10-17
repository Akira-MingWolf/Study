package Lecture6;
import java.util.Scanner;
public class EX3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int data[] = new int[4];
        int sum = 0;
        String equation = "";
        for (int i = 0       ;i < data.length       ;i ++       ) {
            System.out.print("Enter integer " + (i + 1) + " : ");
            data[i] = input.nextInt();
            sum += data[i];
            equation += data[i];
            equation += i < (data.length - 1) ? " + " : " = ";
        }
        System.out.print(equation);
        System.out.print(sum);
    }
}
