package Lecture3;
import java.util.Scanner;
public class TaxCalculation {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
//allowance
        int singleAllowance = 132000;
        int waifuAllowance = 264000;
        int eachChildAllowance = 100000;
        int eachBroAllowance = 33000;
        int eachOldpplAllowance = 46000;
//ask question
        System.out.print("Please enter your yearly income : ");
        int income = input.nextInt();
//
        if (income - singleAllowance <= 0) {
            System.out.print("You do not have to pay any tax");
            return;
        }
//
        System.out.print("Are you single (1) or married (2) ? ");
        int waifu = input.nextInt();

        if (waifu == 1) {
        } else if (waifu == 2) {
            if (income - waifuAllowance <= 0) {
                System.out.print("You do not have to pay any tax");
                return;
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
        int oldppl = input.nextInt();
//calculation
        if (waifu == 1) {
            int totalAllowance = singleAllowance + eachChildAllowance * children + eachBroAllowance * bro + eachOldpplAllowance * oldppl;
            int netChargeableIncome = income - totalAllowance;
            double progressiveTax;
            double standardTax = netChargeableIncome * 0.15;
            System.out.printf("Your allowance is $" + totalAllowance);
            if (income - totalAllowance <= 0) {
                System.out.print("\nYou do not have to pay any tax");
                return;
            } else {
                System.out.printf("\nYour net chargeable income is $" + income + " - $" + totalAllowance + " = $" + netChargeableIncome);
                if (netChargeableIncome <= 40000) {
                    progressiveTax = netChargeableIncome * 0.02;
                } else if (netChargeableIncome <= 80000) {
                    progressiveTax = 800 + (netChargeableIncome - 40000) * 0.07;
                } else if (netChargeableIncome <= 120000) {
                    progressiveTax = 3600 + (netChargeableIncome - 80000) * 0.12;
                } else {
                    progressiveTax = 8400 + (netChargeableIncome - 120000) * 0.17;
                }
            }
            if (standardTax - progressiveTax < 0) {
                System.out.print("\nYou have to pay standard tax");
                System.out.print("\nYour payable tax is $" + netChargeableIncome);
                System.out.printf(" x 15%% = $%.0f" , standardTax);
            } else {
                if (netChargeableIncome <= 40000) {
                    System.out.printf("\nYour payable tax is $%.0f" , progressiveTax);
                } else if (netChargeableIncome <= 80000) {
                    System.out.printf("\nYour payable tax is $800 + $%.0f = $%.0f" , (progressiveTax - 800) , progressiveTax);
                } else if (netChargeableIncome <= 120000) {
                    System.out.printf("\nYour payable tax is $800 + $2800 + $%.0f = $%.0f" , (progressiveTax - 3600) , progressiveTax);
                } else {
                    System.out.printf("\nYour payable tax is $800 + $2800 + $4800 + $%.0f = $%.0f" , (progressiveTax - 8400) , progressiveTax);
                }
            }
        } else {
            int totalAllowance = waifuAllowance + eachChildAllowance * children + eachBroAllowance * bro + eachOldpplAllowance * oldppl;
            int netChargeableIncome = income - totalAllowance;
            double progressiveTax;
            double standardTax = netChargeableIncome * 0.15;
            System.out.printf("Your allowance is $" + totalAllowance);
            if (income - totalAllowance <= 0) {
                System.out.print("\nYou do not have to pay any tax");
                return;
            } else {
                System.out.printf("\nYour net chargeable income is $" + income + " - $" + totalAllowance + " = $" + netChargeableIncome);
                if (netChargeableIncome <= 40000) {
                    progressiveTax = netChargeableIncome * 0.02;
                } else if (netChargeableIncome <= 80000) {
                    progressiveTax = 800 + (netChargeableIncome - 40000) * 0.07;
                } else if (netChargeableIncome <= 120000) {
                    progressiveTax = 3600 + (netChargeableIncome - 80000) * 0.12;
                } else {
                    progressiveTax = 8400 + (netChargeableIncome - 120000) * 0.17;
                }
            }
            if (standardTax - progressiveTax < 0) {
                System.out.print("\nYou have to pay standard tax");
                System.out.print("\nYour payable tax is $" + netChargeableIncome);
                System.out.printf(" x 15%% = $%.0f" , standardTax);
            } else {
                if (netChargeableIncome <= 40000) {
                    System.out.printf("\nYour payable tax is $%.0f" , progressiveTax);
                } else if (netChargeableIncome <= 80000) {
                    System.out.printf("\nYour payable tax is $800 + $%.0f = $%.0f" , (progressiveTax - 800) , progressiveTax);
                } else if (netChargeableIncome <= 120000) {
                    System.out.printf("\nYour payable tax is $800 + $2800 + $%.0f = $%.0f" , (progressiveTax - 3600) , progressiveTax);
                } else {
                    System.out.printf("\nYour payable tax is $800 + $2800 + $4800 + $%.0f = $%.0f" , (progressiveTax - 8400) , progressiveTax);
                }
            }
        }
    }
}