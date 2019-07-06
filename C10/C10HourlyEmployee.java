
package C10;

import C08.C08Date;

public class C10HourlyEmployee extends C10Employee{
    private double wage;
    private double hours;
    
    
    public C10HourlyEmployee(String firstName, String lastName,
            String socialSecurityNumber, double wage, double hours, C08Date birthDate){
        
        super(firstName, lastName, socialSecurityNumber, birthDate);
        
        if (wage < 0.0){
            throw new IllegalArgumentException("wage must be >= 0.0");
        }
        
        if (hours < 0.0 || hours > 168.0) {
                throw new IllegalArgumentException(
                    "hours must be >= 0.0 and <= 168");
        }
        
        this.wage = wage;
        this.hours = hours;
    }
    
    public void setWage(double wage){
        if(wage < 0.0){
            throw new IllegalArgumentException("wage must be >= 0.0");
        }
        
        this.wage = wage;
    }    
    
    public void setHours(double hours){
        if(hours < 0.0 || hours > 168){
            throw new IllegalArgumentException(
                    "hours must be >= 0.0 and <= 168");
        }
        
        this.hours = hours;
    }
    
    public double getWage(){return wage;}
    public double getHours(){return hours;}
    
    @Override
    public double getPaymentAmount(){
        double earnings;
        
        if(hours <= 40)
            earnings = getWage() * getHours();
        
        else
            earnings = 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        
        return earnings;
    }
    
    @Override
    public String toString(){
        return String.format("hourly employee: %s%n%s: %,.2f; %s: %,.2f",
                super.toString(),
                "hourly wage", getWage(),
                "hours worked", getHours());
    }
}
