package C08;

import java.math.BigDecimal;
import java.text.NumberFormat;
public class C08Account {
    private String name; //variável de instância
    private BigDecimal balance; //variável de instância
    
    //Construtor da classe Account recebe dois parâmetros
    public C08Account(String name, BigDecimal balance){
    this.name = name;
        
    //Se o depósito for válido, adicionar a balance o valor do depósito
    if (balance.compareTo(BigDecimal.ZERO) == 1)
        this.balance = balance;
    }
    
    //Método que deposita dinheiro na conta se o valor for > 0
    public void deposit(BigDecimal depositAmount){
        if (depositAmount.compareTo(BigDecimal.ZERO) == 1){
            balance = balance.add(depositAmount);
            System.out.printf("%s depositou %s%n", 
                name, NumberFormat.getCurrencyInstance().format(depositAmount));
        }
        else {
            System.out.print("Desculpe, apenas valores acima de R$00,00 são ");
            System.out.println("aceitos.");
        }
    }
    
    //Método que retorna o saldo da conta
    public BigDecimal getBalance(){
        return balance;
    }
    
    //Método que define o nome
    public void setName(String name)
    {
        this.name = name;
    }
    
    //Método que retorna o nome
    public String getName()
    {
        return name;
    }
    
    public void tirar_dinheiro(BigDecimal dinheiro){
        if (balance.compareTo(dinheiro) == -1){
            System.out.print("Você não pode retirar mais dinheiro do que ");
            System.out.println("possui na conta.");
        }
        else
            balance = balance.subtract(dinheiro);
    }
    
    public void display_account(){
        System.out.println("Conta:");
        System.out.println("Nome: " +  name);
        System.out.println("Saldo: " + 
                NumberFormat.getCurrencyInstance().format(balance) + "\n");
    }
}
