package Lecture13;

import java.util.Scanner;

public class EX3 {
    public static boolean palindrome(String w) {
        for (int i = 0; i < w.length()/2 ; ++i) {
            int j = w.length() - i - 1;
            if (w.charAt(i) != w.charAt(j))
                return false;
        }
        return true;
    }

    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Usage : Palindrome word");
        String word = in.nextLine();
        if (palindrome(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
