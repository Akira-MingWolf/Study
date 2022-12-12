package Enum;
import java.util.*;
public class EX2 {
    enum job {
        warrior, sorcerer, archer
    };
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);

        job[] jobs = job.values();
        for (int i = 0       ;i < jobs.length       ;i ++       ) {
            System.out.println(i + " : " + jobs[i]);
        }

        System.out.print("Please select your job : ");
        int jobID = input.nextInt();
        job i = jobs[jobID];

        System.out.println("You are a " + i);
        switch (i) {
            case warrior : System.out.println("Let's pick up an axe");
                break;
            case sorcerer : System.out.println("Let's learn some spells");
                break;
            case archer : System.out.println("Let's pickup some arrows");
        }
    }
}
