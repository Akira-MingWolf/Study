package Lecture8;

public class EX4 {
    // Overloaded method: sum
    public static int sum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
    public static double sum(double[] arr) {
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }
        return sum;
    }


    // Overloaded method: average
    public static int average(int[] arr) {
        int average;
        average = sum(arr) / arr.length;
        return average;
    }
    public static double average(double[] arr) {
        double average;
        average = sum(arr) / arr.length;
        return average;
    }


    // Method : addSelf
    public static void addSelf(int[] arr , int b) {
        for (int i = 0       ;i < arr.length       ;i ++       ) {
            arr[i] += b;
        }
    }


    // Method : add
    public static int[] add(int[] arr , int b) {
        int[] ans;
        ans = arr.clone();
        for (int i = 0       ;i < ans.length       ;i ++       ) {
            ans[i] += b;
        }
        return ans;
    }


    // Method : printArray
    // Format : a = { 1, 2, 3, 4 }
    public static void printArray(String a , int[] arr) {
        System.out.print(a + " = { ");
        for (int n : arr) {
            if (n == arr[(arr.length - 1)]) {
                System.out.print(n);
                break;
            }
            System.out.print(n + ", ");
        }
        System.out.println(" }");
    }


    public static void main (String[] args) {
        double [] d = { 6, 0, 4, 4 };
        System.out.println("The average of d is " + average(d)); // 3.5
        System.out.println("The sum of d is " + sum(d)); // 14.0

        int [] i = { 1, 2, 3, 4, 5, 6 };
        addSelf(i, 10); // i becomes { 11, 12, 13, 14, 15, 16 }
        System.out.println("The average of i is " + average(i)); // 13
        System.out.println("The sum of i is " + sum(i)); // 81

        int [] k = add(i, 20);
        // k is a new array { 31, 32, 33, 34, 35, 36 }
        // i is unchanged
        printArray("i", i); // i = { 11, 12, 13, 14, 15, 16 }
        printArray("k", k); // k = { 31, 32, 33, 34, 35, 36 }
        System.out.println("The average of k is " + average(k)); // 33
        System.out.println("The sum of k is " + sum(k)); // 201
    }
}
