package ui;

import data.CalcBankBalance;

import java.util.Scanner;

public class DisplayBalance {
    static Scanner sc = new Scanner(System.in);
    static CalcBankBalance currentBalance = new CalcBankBalance();

    public static void currentAmount() {
        System.out.println("What would you like to do Withdraw (press w), Deposit (press d), or Exit (press e)?");
        String userInput = sc.next();

        //System.out.println("You pressed " + sc.nextLine());
        /* if user input matches the required commands call the appropriate method
         * otherwise close program
         * or prompt for valid command
         * */
        //code is currently continuing to run without user prompts
        switch (userInput.toLowerCase()) {
            case "w":
                withdrawFromAccount();
            case "d":
                depositToAccount();
            case "e": {
                System.out.println("Thanks for banking with us!");
                System.exit(0);
            }
            default: System.out.println("Please enter a valid command.");
        }
    }

    private static void withdrawFromAccount() {
        System.out.println("How much would you like to withdraw?");
        int withdrawalAmount = sc.nextInt();
        /* call pre-defined withdraw method from CalcBankBalance and test if there is enough
         * to withdraw
         * */
        int withdrawal = currentBalance.withdraw(withdrawalAmount);
        if (withdrawalAmount <= withdrawal) {
            System.out.println("CalBankBalance = " + withdrawal);
        } else {
            WithdrawalBalance.withdrawWithMessage(withdrawalAmount);
        }
        System.out.println("Your current balance is $" + currentBalance.getCurrentAmount());

        currentAmount();
    }

    private static void depositToAccount() {
        System.out.println("How much would you like to deposit?");
        int depositAmount = sc.nextInt();
        int deposit = currentBalance.deposit(depositAmount);
        System.out.println("Your current balance is $" + deposit);

        currentAmount();
    }


}
