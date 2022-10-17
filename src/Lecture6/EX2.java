package Lecture6;

public class EX2 {
    public static void main (String[] args) {
        String data[] = {"This", "is", "a", "string", "array"};

        System.out.println("The array is of length " + data.length);
        System.out.println("Use for-loop to print");
        for (int i = 0       ;i < data.length       ;i ++       ) {
            System.out.println(i + " - " + data[i]);
        }
        
        System.out.println("Use for-each loop to print");
        for (String e       :data       ) {
            System.out.print(e + " ");
        }
    }
}
