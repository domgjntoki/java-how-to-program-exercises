package C09;

public class C09PieceWorker extends C09Employee {
    private final int peçasFeitas;
    
    public C09PieceWorker(String firstName, String lastName, String seguroSocial,
            int peçasFeitas){
        super(firstName, lastName, seguroSocial);
        
        this.peçasFeitas = peçasFeitas;
    }
    
    public int getPeçasFeitas(){return peçasFeitas;}
    
    @Override
    public String toString(){
        return String.format("%s%n%s%n%s%d", "pieceWorker", super.toString(),
                "peçasFeitas: ", peçasFeitas);
    }
}
