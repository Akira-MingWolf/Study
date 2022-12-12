package Lecture13;
import java.util.*;
public class EX1 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a sentence : ");
        String a = in.nextLine();
        StringTokenizer b = new StringTokenizer(a);
        StringBuilder c = new StringBuilder();
        while(b.hasMoreTokens()){

            c.insert(0," ");

            c.insert(0,b.nextToken());

        }
        System.out.println(c);
    }
}
