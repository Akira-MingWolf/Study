package Lecture8;

public class EX2 {
    // Method : fullName
    // Join the firstName and surName together
    // Return the string
    public static String fullName(String a , String b) {
        String fullName = a + " " + b;
        return fullName;
    }


    // Method : makeFullName
    // Replace each name with fullname in the array
    public static void makeFullName(String[] arr, String surName) {
        for (int i = 0       ;i < arr.length       ;i ++       ) {
            arr[i] = fullName(arr[i] , surName);
        }
    }


    // Method : printArray
    // Print the array
    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }


    public static void main (String[] args) {
        String surName = "Chan";
        String fullName = fullName("David", surName);
        System.out.println("The fullname is " + fullName);

        String [] names = { "Peter", "John", "May" };
        makeFullName (names, surName);

        System.out.println("The fullnames of the family are:");
        printArray(names); // Peter Chan
    }                      // John Chan
}                          // May Chan
