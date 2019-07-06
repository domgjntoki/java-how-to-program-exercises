package C10;

import C08.C08Date;

public class C10CommissionEmployee extends C10Employee{
    private double grossSales;
    private double commissionRate;
    
    public C10CommissionEmployee(String firstName, String lastName,
        String socialSecurityNumber, 
        double grossSales, double commissionRate, C08Date birthDate){
    
        super(firstName, lastName, socialSecurityNumber, birthDate);
        
        if(commissionRate <= 0 || commissionRate >= 1){
            throw new IllegalArgumentException("commisionRate must be ]0, 1[");
        }
        
        if(grossSales < 0.0){
            throw new IllegalArgumentException("grossSales must be >= 0");
        }
        
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }
    
    public void setGrossSales(double grossSales){
        if(grossSales < 0.0){
            throw new IllegalArgumentException("grossSales must be >= 0");
        }
        
        this.grossSales = grossSales;
    }
    
    public void setCommissionRate(double commissionRate){
        if(commissionRate <= 0 || commissionRate >= 1){
            throw new IllegalArgumentException("commissionRate must be ]0, 1[");
        }
        
        this.commissionRate = commissionRate;
    }
    
    public double getGrossSales(){return grossSales;}
    public double getCommissionRate(){return commissionRate;}
    
    @Override
    public double getPaymentAmount(){
        return getGrossSales() * getCommissionRate();
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: R$%,.2f%n%s: %,.2f",
                "comission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}
