package C09;

public class C09ComissionEmployee extends C09Employee{
    private double grossSales; // vendas brutas semanais
    private double comissionRate; // percentagem da comissão
    
    public C09ComissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, 
            double grossSales, double comissionRate) {
        
        super(firstName, lastName, socialSecurityNumber);
        
        if(grossSales < 0.0)
            throw new IllegalArgumentException("grossSales must be >= 0");
        if(comissionRate <= 0.0 || comissionRate >= 1)
            throw new IllegalArgumentException("comissionRate must be ]0, 1[");
        
        this.grossSales = grossSales;
        this.comissionRate = comissionRate;
    }
    
    public void setGrossSales(double grossSales){
        if(grossSales < 0.0)
            throw new IllegalArgumentException("grossSales must be >= 0");
        this.grossSales = grossSales;
    }
    public double getGrossSales(){return grossSales;}
        
    public void setComissionRate(double comissionRate){
        if(comissionRate <= 0 || comissionRate >= 1)
            throw new IllegalArgumentException("comissionRate must be ]0, 1[");
    }
    public double getComissionRate(){return comissionRate;}
    
    public double earnings(){return grossSales * comissionRate;}
    
    @Override
    public String toString(){
        return String.format("%s%n%s: %.2f%n%s: %.2f",
    super.toString(),
    "gross sales", grossSales,
    "commission rate", comissionRate);
    }
}
