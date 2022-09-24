package Lecture1;

public class EX3 {
    public static void main (String[] args) {
        String name = "Peter";
        int income = 20000;
        int expense = 8000;
        int totalIncome = income * 12;
        int totalExpense = expense * 12;
        int save = totalIncome - totalExpense;
        int tenYearSave = save * 10;

        System.out.println(name + ", your monthly income is $" + income);
        System.out.println("Your monthly expense is $" + expense);
        System.out.println("Your total income per year is $" + totalIncome);
        System.out.println("You spent $" + totalExpense + " per year");
        System.out.println("You can save $" + save + " per year");
        System.out.println("After 10 years, you can save $" + tenYearSave);
    }
}