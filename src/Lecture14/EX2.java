package Lecture14;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class EX2 {
    public static int toInt(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }
    public static double toDouble(String s) throws NumberFormatException {
        return Double.parseDouble(s);
    }
    public static void main(String []args) {
        ArrayList<String> info = new ArrayList<>();
        String name = "";
        int age = 0;
        double weight = 0.0;
        boolean check = true;
        String fileName = "personalInfo.txt";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileInfo;
            while ((fileInfo = bufferedReader.readLine()) != null) {
                info.add(fileInfo);
            }
            bufferedReader.close();
            name = info.get(0);
            age = toInt(info.get(1));
            weight = toDouble(info.get(2));
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid " + fileName);
            check = false;
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid " + fileName);
            check = false;
        }
        catch(FileNotFoundException ex) {
            System.out.println( "Unable to open file '" + fileName + "'");
            check = false;
        }
        catch(IOException ex) {
            System.out.println( "Error reading file '" + fileName + "'");
            check = false;
        }
        if (check) {
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Weight : " + weight);
        }
    }
}
