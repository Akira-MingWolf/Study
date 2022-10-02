package Lecture3;

public class EX2 {
    public static void main (String[] args) {
        String animal = "dog";
        System.out.print(animal + " is a ");
        switch (animal) {
            case "dog":
            case "cat":
                System.out.println("domestic animal");
                break;
            case "tiger":
            case "lion":
            case "elephant":
                System.out.println("wild animal");
                break;
            default:
                System.out.println("unknown animal");
                break;
        }
    }
}
