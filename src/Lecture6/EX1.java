package Lecture6;

public class EX1 {
    public static void main (String[] args) {
        int data[] = {57, 87, 32, 70};
        char grade;
        System.out.println("There are " + data.length + " students");
        for (int i = 0       ;i < data.length       ;i ++       ) {
            if (data[i] < 50) {
                grade = 'F';
            } else if (data[i] < 65) {
                grade = 'C';
            } else if (data[i] < 80) {
                grade = 'B';
            } else {
                grade = 'A';
            }
            System.out.println(data[i] + " - Grade " + grade);
        }
    }
}
