package C08;

public class C08SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;
    
    public C08SavingsAccount(double savingsBalance){
        if(savingsBalance < 0){
            throw new IllegalArgumentException
                ("Valores negativos não são permitidos");
        }
        this.savingsBalance = savingsBalance;
    }
    
    public double calculateMonthlyInterest(){
        return savingsBalance *  annualInterestRate / 12;
    }
    
    public static void modifyInterestRate(double annualInterestRate){
        C08SavingsAccount.annualInterestRate = annualInterestRate;
    }
    
}
