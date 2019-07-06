package C10;

import C08.C08Date;

public class C10BasePlusCommissionEmployee extends C10CommissionEmployee {
    private double baseSalary;
    
    public C10BasePlusCommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, 
            double grossSales, double commissionRate, double baseSalary,
            C08Date birthDate){
    
        super(firstName, lastName, socialSecurityNumber, 
              grossSales, commissionRate, birthDate);
        
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("baseSalary must be >= 0");
        
        this.baseSalary = baseSalary;
    }
    
    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("baseSalary must be >= 0");
        
        this.baseSalary = baseSalary;
    }
    
    public double getBaseSalary(){return baseSalary;}
    
    @Override
    public double getPaymentAmount(){
        return super.getPaymentAmount() + getBaseSalary();
    }
    
    @Override
    public String toString(){
        return String.format("%s %s; %s: R$%,.2f",
                "base-salaried", super.toString(),
                "baseSalary", getBaseSalary());
    }
}
