package Lecture7;
import java.util.Scanner;
public class EX2 {
    public static void main (String[] args) {
        //input
        Scanner input = new Scanner(System.in);
        //array
        String objs[][] = { {"red", "green", "blue"}, // color
                            {"apple", "pear", "blueberry"}, // fruit
                            {"sun", "tree", "sky"}}; // nature
        //questions
        System.out.println("Please select from the following:");
        System.out.println("1) Print colors");
        System.out.println("2) Print fruits");
        System.out.println("3) Print nature");
        System.out.println("4) Print red objects");
        System.out.println("5) Print green objects");
        System.out.println("6) Print blue objects");
        System.out.print("Your choice : ");
        int choice = input.nextInt();
        switch (choice) {
            case 1 :
                for (int i = 0       ;i < objs[0].length       ;i ++       ) {
                    System.out.println(objs[0][i]);
                } break;
            case 2 :
                for (int i = 0       ;i < objs[1].length       ;i ++       ) {
                    System.out.println(objs[1][i]);
                } break;
            case 3 :
                for (int i = 0       ;i < objs[2].length       ;i ++       ) {
                    System.out.println(objs[2][i]);
                } break;
            case 4 :
                for (int i = 0       ;i < objs.length       ;i ++       ) {
                    System.out.println(objs[i][0]);
                } break;
            case 5 :
                for (int i = 0       ;i < objs.length       ;i ++       ) {
                    System.out.println(objs[i][1]);
                } break;
            case 6 :
                for (int i = 0       ;i < objs.length       ;i ++       ) {
                    System.out.println(objs[i][2]);
                } break;
        }
    }
}
