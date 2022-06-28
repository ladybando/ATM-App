package ui;

import data.CalcBankBalance;

import static data.DollarConstants.ONE_DOLLARS;
import static data.DollarConstants.FIVE_DOLLARS;
import static data.DollarConstants.TEN_DOLLARS;
import static data.DollarConstants.TWENTY_DOLLARS;
import static data.DollarConstants.FIFTY_DOLLARS;
import static data.DollarConstants.ONE_HUNDRED;

public class WithdrawalBalance {

    static int oneHundredDollars;
    static int fiftyDollars;
    static int twentyDollars;
    static int tenDollars;
    static int fiveDollars;
    static int oneDollar;

    public static String withdrawWithMessage(int amountToWithdraw) {
        String returnMessage = "";

        for (int i = 0; i < 6; i++) {
            if (amountToWithdraw >= 100 || amountToWithdraw < 100 || amountToWithdraw < 50 || amountToWithdraw < 20 || amountToWithdraw < 10 || amountToWithdraw < 5 || amountToWithdraw >= 5) {
                oneHundredDollars = amountToWithdraw / ONE_HUNDRED;
                fiftyDollars = amountToWithdraw / FIFTY_DOLLARS;
                twentyDollars = amountToWithdraw / TWENTY_DOLLARS;
                tenDollars = amountToWithdraw / TEN_DOLLARS;
                fiveDollars = amountToWithdraw / FIVE_DOLLARS;
                oneDollar = amountToWithdraw / ONE_DOLLARS;
            } else {
                CalcBankBalance withdrawError = new CalcBankBalance();
                withdrawError.withdraw(amountToWithdraw);
            }

        }
        returnMessage =
                "$1 bills = " + oneDollar + "\n" +
                "$5 bills = " + fiveDollars + "\n" +
                "$10 bills = " + tenDollars + "\n" +
                "$20 bills = " + twentyDollars + "\n" +
                "$100 bills = " + oneHundredDollars;

        return returnMessage;
    }
}
