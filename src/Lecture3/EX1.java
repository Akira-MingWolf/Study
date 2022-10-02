package Lecture3;

public class EX1 {
    public static void main (String[] args) {
        char grade = 'A';
        System.out.println("Your grade is " + grade);
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'E':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
    }
}
