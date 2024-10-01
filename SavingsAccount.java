


package assignment_4;

public class SavingsAccount {
	private static double annualInterestRate;
    private double savingsBalance;

   
    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    
    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        
        SavingsAccount.modifyInterestRate(0.03);

        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 balance after 3%% interest: $%.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 balance after 3%% interest: $%.2f\n", saver2.getSavingsBalance());

        
        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 balance after 4%% interest: $%.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 balance after 4%% interest: $%.2f\n", saver2.getSavingsBalance());
    }

}
