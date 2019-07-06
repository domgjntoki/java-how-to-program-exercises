package C15Arquivos.exercicios;

import C15Arquivos.*;
import java.io.Serializable;

/**
 *
 * @author Fredson Sumi
 */
public class Account implements Serializable{
    private int account;
    private String firstName;
    private String lastName;
    private double balance;
    
    public Account(){
        this(0, "", "", 0);
    }
    
    public Account(int account, String firstName, 
            String lastName, double balance){
        
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    public void combine(TransactionRecords tR){
        this.balance += tR.getTransactionValue();
    }
    // configura o número de conta
    public void setAccount(int account){this.account = account;}
    // obtém número de conta
    public int getAccount(){return account;}
    
    // configura o nome
    public void setFirstName(String firstName){this.firstName = firstName;}
    // obtém o nome
    public String getFirstName(){return firstName;}

    // configura o sobrenome
    public void setLastName(String lastName){this.lastName = lastName;}
    // obtém o sobrenome
    public String getLastName(){ return lastName;}
    
    // configura saldo
    public void setBalance(double balance){this.balance = balance;}
    // obtém saldo
    public double getBalance(){return balance;}
    
}

    