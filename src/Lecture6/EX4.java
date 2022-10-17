package Lecture6;

public class EX4 {
    public static void main (String[] args) {
        int rawData[] = {23, 6, 57, 14, 13};
        int odd = 0;
        double average = 0;
        for (int i = 0       ;i < rawData.length       ;i ++       ) {
            average += rawData[i];
            if (rawData[i] % 2 == 1) {
                odd ++;
            }
        }
        average /= rawData.length;
        System.out.println("The average should be " + average);
        System.out.println("The number of odd numbers should be " + odd);
        int oddNum[] = new int[odd];
        int i = 0;
        for (int d       :rawData       ) {
            if (d % 2 == 1) {
                oddNum[i++] = d;
            }
        }


        System.out.println("The odd numbers should be ");
        for (int e       :oddNum       ) {
            System.out.print(e + " ");
        }
    }
}
