package C10;

import C08.C08Date;

public class C10SalariedEmployee extends C10Employee{
    private double weekSalary;
    
    public C10SalariedEmployee(String firstName, String lastName, 
            String socialSecurityNumber, double weekSalary, C08Date birthDate){
        
        super(firstName, lastName, socialSecurityNumber, birthDate);
        
        if(weekSalary <= 0){
            throw new IllegalArgumentException("weekSalary must be <= 0");
        }
        
        this.weekSalary = weekSalary;
    }
    public void setWeekSalary(double weekSalary){
        this.weekSalary = weekSalary;
    }
    
    public double getWeekSalary(){return weekSalary;}
    
    @Override
    public double getPaymentAmount(){return weekSalary;}
    
    @Override
    public String toString(){
        return String.format("salaried employee: %s%n%s: R$%,.2f", 
                super.toString(), "week salary" ,getWeekSalary());
    }
}
