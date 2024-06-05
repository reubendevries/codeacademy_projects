public class CarLoan {

  // calculates whether a proposed Car Loan is valid and how much your monthly payment should be.
  
  int carLoan = 10000;
  int loanLength = 3;
  int interestRate = 5;
  int downPayment = 2000;

  CarLoan(int carLoan, int loanLength, int interestRate, int downPayment) {
    this.carLoan = carLoan;
    this.loanLength = loanLength;
    this.interestRate = interestRate;
    this.downPayment = downPayment;
  }

  boolean validLoan() {

    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error: You must take out a valid loan");
      return false;
    } else if (carLoan <= downPayment) {
      System.out.println("The car can be paid in full.");
      return false;
    } else {
      return true;
    }
  }

  public int calculateMonthlyPayment() {
    int remainingBalance = (carLoan - downPayment);
    int loanInMonths = (loanLength * 12);
    int monthlyBalance = (remainingBalance / loanInMonths);
    int interestPayment = (monthlyBalance * interestRate) / 100;
    int monthlyPayment = (monthlyBalance + interestPayment);
    return monthlyPayment;
  }

  public static void main(String[] args) {
    CarLoan myCarLoan = new CarLoan(10000, 3, 5, 2000);
    myCarLoan.validLoan();

    System.out.println("Is my car loan a valid loan? " + myCarLoan.validLoan());
    System.out.println("The monthly payment should be: " + myCarLoan.calculateMonthlyPayment());
  }
}
