package C09;

public class C09HourlyEmployee extends C09Employee {
    private double hours;
    private double wage;
    public C09HourlyEmployee(String firstName, String lastName, 
            String socialSecurityNumber, double hours, double wage){
        
            super(firstName, lastName, socialSecurityNumber);
            
            if(hours < 0 || hours > 168)
                throw new IllegalArgumentException
                          ("Hours amount must be (0 - 168)");
            if(wage < 0)
                throw new IllegalArgumentException("wage must be >= 0");
            
            this.hours = hours;
            this.wage = wage;            
    }
       
    public void setHours(double hours){
        if(hours < 0 || hours > 168)
           throw new IllegalArgumentException
                    ("Hours amount must be (0 - 168)");
        this.hours = hours;
    }
    public double getHours(){return hours;}
    
    public void setWage(double wage){
        if(wage < 0)
            throw new IllegalArgumentException("wage must be >= 0");
    }
    
    public double getWage(){return wage;}
    
    public double earnings(){
        return hours * wage;
    }
    
    @Override
    public String toString(){
        return String.format("%s%n%s: %.2f%n%s: $%.2f", super.toString(),
                "hours", hours,
                "wage", wage);
    }
}
