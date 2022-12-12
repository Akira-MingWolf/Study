package Lecture14;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class EX1 {
    static Scanner in;
    public static String askString(String s) {
        String ans;
        while (true) {
            System.out.println(s);
            try {
                ans = in.nextLine();
            }
            catch (Exception e) {
                ans = "";
            }
            if (ans.equals("")) {
                System.out.println("Invalid input. Please try again");
            } else {
                return ans;
            }
        }
    }
    public static int askInt(String s) {
        int ans;
        while (true) {
            System.out.println(s);
            try {
                ans = in.nextInt();
            }
            catch (Exception e) {
                ans = 0;
                String temp = in.nextLine();
            }
            if (ans <= 0) {
                System.out.println("Invalid input. Please try again");
            } else {
                return ans;
            }
        }
    }
    public static double askDouble(String s) {
        double ans;
        while (true) {
            System.out.println(s);
            try {
                ans = in.nextDouble();
            }
            catch (Exception e) {
                ans = 0.0;
                String temp = in.nextLine();
            }
            if (ans <= 0.0) {
                System.out.println("Invalid input. Please try again");
            } else {
                return ans;
            }
        }
    }
    public static void writeToFile(String fileName, ArrayList<String> arrayList) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : arrayList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch (IOException e) {
            System.out.println( "Error writing to file '" + fileName + "'");
        }
    }


    public static void main (String[] args) {
        in = new Scanner(System.in);
        ArrayList<String> info = new ArrayList<>();
        String name = askString("What is your name?"); // Ask a string
        info.add(name);
        int age = askInt("What is your age?"); // Ask a valid int
        info.add(String.valueOf(age));
        double weight = askDouble("What is your weight in kg?"); // Ask a valid double
        info.add(String.valueOf(weight));
        writeToFile("personalInfo.txt", info); // write ArrayList to file
    }
}
