package ui;

import data.CalcBankBalance;

import java.util.Scanner;
public class DisplayBalance {
    static Scanner sc = new Scanner(System.in);
    static CalcBankBalance currentBalance = new CalcBankBalance();
    public static void currentAmount(){

        System.out.println("Your current balance is " + currentBalance.getCurrentAmount());

        System.out.println("What would you like to do Withdraw (press w) or Deposit (press d)");
        String userInput = sc.nextLine();
        if(userInput.equals("w") || userInput.equals("W")){
            withdrawFromAccount();
        }else {
            depositToAccount();
        }
        //System.out.println("You pressed " + sc.nextLine());
    }

    private static void withdrawFromAccount(){
        System.out.println("How much would you like to withdraw?");
        int withdrawalAmount = sc.nextInt();
        WithdrawalBalance.withdrawWithMessage(withdrawalAmount);
        System.out.println("Your current balance is $" + currentBalance.getCurrentAmount());
    }

    private static void depositToAccount(){
        System.out.println("How much would you like to deposit?");
        int depositAmount = sc.nextInt();
        currentBalance.deposit(depositAmount);
        System.out.println("Your current balance is $" + currentBalance.getCurrentAmount());
    }


}
