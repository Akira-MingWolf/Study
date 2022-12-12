package Lecture13;
import java.util.*;
public class EX2 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a sentence : ");
        String a = in.nextLine();
        StringTokenizer b = new StringTokenizer(a);
        StringBuilder c = new StringBuilder();
        c.ensureCapacity(a.length());
        while (b.hasMoreTokens()) {
            String t = b.nextToken();
            for (int i = a.length() - 1       ;i >= 0       ;i --       ) {
                c.append(t.charAt(i));
            }
            if (b.hasMoreTokens()) {
                c.append(" ");
            }
        }
        System.out.println(c);
    }
}
