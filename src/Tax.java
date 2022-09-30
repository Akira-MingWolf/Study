import java.util.Scanner;
public class Tax {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
//allowance
        int singleAllowance = 132000;
        int marriedAllowance = 264000;
        int eachChildAllowance = 100000;
        int eachBroAllowance = 33000;
        int eachDependentParentsAllowance = 46000;
        int singleOrMarried; // variable of case single or case married
//ask question
        System.out.print("Please enter your yearly income : ");
        int income = input.nextInt();

        if (income - singleAllowance <= 0) {
            System.out.print("You do not have to pay any tax");   //do u need to pay tax
            return;
        }
//keep ask question
        System.out.print("Are you single (1) or married (2) ? ");
        int single = input.nextInt();

        if (single == 1) {
            singleOrMarried = singleAllowance;
        } else if (single == 2) {
            // set value of single or married
            if (income - marriedAllowance <= 0) {
                System.out.print("You do not have to pay any tax");
                return;
            } else {
                singleOrMarried = marriedAllowance;
            }
        } else {
            System.out.print("please enter a valid number"); //you can only type 1 or 2 , other will return
            return;
        }

        System.out.print("How many children do you have? ");
        int children = input.nextInt();

        System.out.print("How many brothers and sisters do you have? ");
        int bro = input.nextInt();

        System.out.print("How many dependent parents and grandparents do you have? ");
        int dependentParents = input.nextInt();
//calculation
        int totalAllowance = singleOrMarried + eachChildAllowance * children + eachBroAllowance * bro + eachDependentParentsAllowance * dependentParents;
        int netChargeableIncome = income - totalAllowance; // calculate the net chargeable income
        double progressiveTax;
        double standardTaxRate = 0.15; // set standard tax rate
        double standardTax = netChargeableIncome * standardTaxRate; // calculate the standard tax

        String printProgressiveTax;

        int first = 40000; // the progressive tax
        double firstTaxRate = 0.02;
        int second = 40000;
        double secondTaxRate = 0.07;
        int third = 40000;
        double thirdTaxRate = 0.12;
        int remain = netChargeableIncome - (first + second + third);
        double remainTaxRate = 0.17;

        long firstFloor = Math.round(first * firstTaxRate); //Math.round for output integer
        long secondFloor = Math.round(second * secondTaxRate);
        long thirdFloor = Math.round(third * thirdTaxRate);

        System.out.println("Your allowance is $" + totalAllowance);
        if (income - totalAllowance <= 0) {
            System.out.println("You do not have to pay any tax");
            return;
        } else {
            // to classify the type of progressive tax
            System.out.println("Your net chargeable income is $" + income + " - $" + totalAllowance + " = $" + netChargeableIncome);
            if (netChargeableIncome <= (first)) {
                progressiveTax = netChargeableIncome * firstTaxRate; // first floor tax
                printProgressiveTax = "Your payable tax is $" + Math.round(progressiveTax) + "\n"; //Math.round for output integer
            } else if (netChargeableIncome <= (first + second)) {
                progressiveTax = firstFloor + (netChargeableIncome - first) * secondTaxRate; // second floor tax
                printProgressiveTax = "Your payable tax is $" + firstFloor + " + $" + Math.round(progressiveTax - firstFloor) + " = $" + Math.round(progressiveTax) + "\n";
            } else if (netChargeableIncome <= (first + second + third)) {
                progressiveTax = firstFloor + secondFloor + (netChargeableIncome - (first + second)) * thirdTaxRate; // third floor tax
                printProgressiveTax = "Your payable tax is $" + firstFloor + " + $" + secondFloor + " + $" + Math.round(progressiveTax - (firstFloor + secondFloor)) + " = $" + Math.round(progressiveTax) + "\n";
            } else {
                progressiveTax = firstFloor + secondFloor + thirdFloor + (remain) * remainTaxRate; // final floor tax
                printProgressiveTax = "Your payable tax is $" + firstFloor + " + $" + secondFloor + " + $" + thirdFloor + " + $" + Math.round(progressiveTax - (firstFloor + secondFloor + thirdFloor)) + " = $" + Math.round(progressiveTax) + "\n";
            }
        }
        if (standardTax < progressiveTax) {
            // this is standard tax
            System.out.println("You have to pay standard tax");
            System.out.print("Your payable tax is $" + netChargeableIncome);
            System.out.printf(" x %.0f%% = $%.0f" , (standardTaxRate * 100) , standardTax); //0.15 * 100 = 15%
        } else {
            // this is progressive tax
            // to classify the type of progressive tax and print
            System.out.println(printProgressiveTax);
        }
    }
}