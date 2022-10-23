package Lecture7;

public class EX1 {
    public static void main (String[] args) {
        int total = 0;
        double sum = 0;

        int arr[][] = { {10,39,8},{3},{35,87},{22},{34} };
        for (int i = 0       ;i < arr.length       ;i ++       ) {
            int a[] = arr[i];
            for (int j = 0       ;j < a.length       ;j ++       ) {
                System.out.print(a[j] + " ");
                total ++;
                sum += a[j];
            }
            System.out.println();
        }
        double average = sum / total;
        System.out.println("Total number of elements is " + total);
        System.out.println("Average is " + average);
    }
}
