package Lecture2;
import java.util.Scanner;
public class EX4 {
    public static void main (String[] args) {
//input
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height in cm : ");
        double height_cm = input.nextDouble();
        if (height_cm <= 0) {
            System.out.print("Invalid input");
            return;
        }

        System.out.print("Please enter your weight in lbs : ");
        double weight_lbs = input.nextDouble();
        if (weight_lbs <= 0) {
            System.out.print("Invalid input");
            return;
        }

//calculation
        double weight_kg = weight_lbs/2.2;
        double height_m = height_cm/100;
        double bmi = weight_kg/(Math.pow(height_m,2));
//logic
        System.out.printf("Your BMI is %.2f. " , bmi);

        if (bmi < 18.5) {
            System.out.print("You are underweight.");
        } else if (bmi < 25) {
            System.out.print("Your weight is normal.");
        } else if (bmi < 30) {
            System.out.print("You are overweight.");
        } else {
            System.out.print("You are seriously overweight.");
        }
    }
}