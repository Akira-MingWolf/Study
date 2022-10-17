package Lecture6;
import java.util.Scanner;
public class EX5 {
    public static void main (String[] args) {
        //input
        Scanner input = new Scanner(System.in);
        //array
        String name[] = {"Banana", "Apple", "Orange"};
        double price[] = {5.0, 4.0, 3.0};
        int inventory[] = {3, 2, 5};
        //display
        System.out.println("Welcome to my store. You can buy the following items");
        for (int i = 0       ;i < name.length       ;i ++       ) {
            System.out.println((i + 1) + ") " + name[i] + " $" + price[i] + " each (" + inventory[i] + " left)");
        }
        //question
        System.out.print("Which one would you like to buy? ");
        int whichProduct = input.nextInt();
        System.out.print("How many Banana would you like to buy? ");
        int amount = input.nextInt();
        if (amount > inventory[(whichProduct - 1)]) {
            System.out.println("Sorry, there is not enough stock. Goodbye.");
        } else {
            double totalPrice = price[(whichProduct - 1)] * amount;
            System.out.print("Thank you, the total price is $" + totalPrice + ". Goodbye.");
        }
    }
}