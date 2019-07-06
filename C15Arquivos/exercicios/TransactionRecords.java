package C15Arquivos.exercicios;

import java.io.Serializable;

/**
 *
 * @author Fredson Sumi
 */
public class TransactionRecords implements Serializable{
    private String accountNumber;
    private double transactionValue;
    
    public TransactionRecords(String accountNumber, double transactionValue){
        this.transactionValue = transactionValue;
        this.accountNumber = accountNumber;
    }
    
    public void setAccountNumber(String aN){this.accountNumber = aN;}
    public void setBalance(double tV){this.transactionValue = tV;}
    
    public String getAccountNumber(){return accountNumber;}
    public double getTransactionValue(){return transactionValue;}
}
