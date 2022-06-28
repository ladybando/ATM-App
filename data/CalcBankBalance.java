package data;

import static data.DollarConstants.ONE_DOLLARS;
import static data.DollarConstants.FIVE_DOLLARS;
import static data.DollarConstants.TEN_DOLLARS;
import static data.DollarConstants.TWENTY_DOLLARS;
import static data.DollarConstants.FIFTY_DOLLARS;
import static data.DollarConstants.ONE_HUNDRED;

public class CalcBankBalance {
    static int bankAccountBalance = 0;

    public int getCurrentAmount() {
        return bankAccountBalance;
    }

    public void deposit(int amountToDeposit) {
        bankAccountBalance += amountToDeposit;
    }

    public void withdraw(int amountToWithDraw) {
        if (bankAccountBalance < amountToWithDraw) {
            System.out.println("Insufficient Funds. :( Please adjust the amount withdrawn.");
        } else {
            bankAccountBalance -= amountToWithDraw;
        }
    }

    //withdraws against five dollar bills
    public int withdrawDollarBills(int numOfBills) {
        //refactor to test for case of bills
        int amountToWithdraw = FIVE_DOLLARS * numOfBills;
        bankAccountBalance -= amountToWithdraw;
        return bankAccountBalance;
    }

    /**
     * TODO 5. The user wants to withdraw a certain amount of money, but only wants 20 dollar bills.
     *  Return the number of 20 dollar bills the ATM machine should give the user. How should we handle
     *  the case when the amount is not divisible by 20?
     */
    public int withdraw20DollarBills(int numOfBills) {

        //refactor to test for case of bills
        int amountToWithdraw = TWENTY_DOLLARS * numOfBills;
        bankAccountBalance -= amountToWithdraw;
        return bankAccountBalance;
    }
}
