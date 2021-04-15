import java.util.Scanner;
import java.util.HashMap;

public class Main {

  static int bankAccountBalance = 0;
    int oneDollar = 1;
	  int fiveDollars = 5;
 	  int tenDollars = 10;
  	int twentyDollars = 20;
  	int fiftyDollars = 50;
  	int oneHundredDollars = 100;

  public static void main(String[] args) {
    Main atm = new Main();
    Scanner sc = new Scanner(System.in);
    
  public int getCurrentAmount() {
    return bankAccountBalance;
  }

  public void deposit(int amountToDeposit) {
    bankAccountBalance += amountToDeposit;
  }

  public void withdraw(int amountToWithDraw) {
	  if(bankAccountBalance < amountToWithDraw){
      	System.out.println("Insufficient Funds. :( Please adjust the amount withdrawn.");
    } else {
       bankAccountBalance -= amountToWithDraw;
    }
}
//withdraws against five dollar bills 
  public int withdrawDollarBills(int amountToWithdraw) {
    int numOfBills = sc.nextInt("Please enter how many bills you would like");
    amountToWithdraw = fiveDollars * numOfBills;
  	bankAccountBalance -= amountToWithdraw;
    return bankAccountBalance;
  }

  /**
   * TODO 5. The user wants to withdraw a certain amount of money, but only wants 20 dollar bills.
   *  Return the number of 20 dollar bills the ATM machine should give the user. How should we handle
   *  the case when the amount is not divisible by 20?
   */
  public int withdraw20DollarBills(int amountToWithdraw) {
    int numOfBills = 1;//this would request user input of how many bills they want
    amountToWithdraw = twentyDollars * numOfBills;
  	bankAccountBalance -= amountToWithdraw;
    return bankAccountBalance;
  }

  public String withdrawWithMessage(int amountToWithdraw) {
    String returnMessage = "";

    int numberOf1s = 0;
    int numberOf5s = 0;
    int numberOf10s = 0;
    int numberOf20s = 0;
    int numberOf50s = 0;
    int numberOf100s = 0;

 for (int i = 0; i < 6; i++) {
if (amountToWithdraw >= 100 || amountToWithdraw < 100 || amountToWithdraw < 50 || amountToWithdraw < 20 || amountToWithdraw < 10 || amountToWithdraw < 5 || amountToWithdraw >= 5) {
  	numberOf100s = amountToWithdraw/100;
  	numberOf50s = amountToWithdraw/50;
	numberOf20s = amountToWithdraw/20;
	numberOf10s = amountToWithdraw/10;
    numberOf5s = amountToWithdraw/5;
    numberOf1s = amountToWithdraw/1;
 } else {
	System.out.println("Please enter valid amounts.");
 }

}
    returnMessage = "$1 bills = " + numberOf1s + "\n" +
        "$5 bills = " + numberOf5s  + "\n" +
        "$10 bills = " + numberOf10s + "\n" +
        "$20 bills = " + numberOf20s  + "\n" +
        "$100 bills = " + numberOf100s;
	return returnMessage;
  }
}
