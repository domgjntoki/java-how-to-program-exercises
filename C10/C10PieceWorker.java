package C10;

import C08.C08Date;

/**
 *
 * @author Fredson Sumi
 */
public class C10PieceWorker extends C10Employee{
    private double wage;
    private int pieces;
    
    public C10PieceWorker(String firstName, String lastName,
            String socialSecurityNumber, 
            double wage, int pieces, C08Date birth)
    {
        super(firstName, lastName, socialSecurityNumber, birth);
        
        if(wage <= 0.0 || wage >= 1.0)
            throw new IllegalArgumentException("wage must be ]0, 1[");
        
        if(pieces < 0)
            throw new IllegalArgumentException("pieces must be >= 0");
        
        this.wage = wage;
        this.pieces = pieces;
    }    
    
    public double getWate(){return wage;}
    public int getPieces(){return pieces;}
    
    @Override
    public double getPaymentAmount(){return pieces * wage;}
    
    @Override
    public String toString(){
        return String.format("%s%n%s: %,.2f%n%s: %d%n",
                super.toString(),
                "wage", wage,
                "pieces", pieces);
    }
}
