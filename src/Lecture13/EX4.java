package Lecture13;

import java.util.Scanner;

public class EX4 {
    public static boolean check(String s) {
        for (int i = 0       ;i < s.length()       ;i ++       ) {
            if (s.charAt(i) != '0' && s.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }
    public static StringBuilder insertBracket(String s) {
        StringBuilder b = new StringBuilder(s);
        for (int i = 0       ;i < b.length()       ;i ++       ) {
            if (b.charAt(i) == '1' && ((i == 0) || (b.charAt(i - 1) == '0'))) {
                b.insert(i, '(');
            } else if (b.charAt(i) == '1' && ((i == b.length() - 1) || (i < b.length() - 1 && b.charAt(i + 1) == '0'))) {
                b.insert(i + 1, ')');
                i += 2;
            }
        }
        return b;
    }

    public static void main(String []args) {
        String []word = {"1010010"};
        if (word.length != 1) {
            System.out.println("Usage : BitString bitstring");
            return;
        }
        String b = word[0];
        if (!check(b))
            System.out.println(b + " is not a bit string");
        else
            System.out.println(insertBracket(b));
    }
}
