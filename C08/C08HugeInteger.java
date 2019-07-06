package C08;

public class C08HugeInteger {
    private String frase;
    
    public C08HugeInteger(String frase){
        this.frase = frase;
    }
     public int[] parse(){
        int[] digitos = new int[40];
        
        for(int i = 0; i < frase.length(); i++)
            digitos[i] = frase.charAt(i);
        
        return digitos;
    }
    /*
     isEqualTo, isNotEqualTo, isGreaterThan, isLessThan, isGreaterThanOrEqualTo e
     isLessThanOrEqualTo.
     */   
     private int relacao(C08HugeInteger frase2){
         int[] digitos1 = this.parse();
         int[] digitos2 = frase2.parse();
         int frase1Valor = 0;
         int frase2Valor = 0;
         for(int i = 0; i < 40; i++){
             frase1Valor += digitos1[i];
             frase2Valor += digitos2[i];
         }
         
         return frase1Valor - frase2Valor;
     }
     public boolean isEqualTo(C08HugeInteger frase2){
         boolean isEqual = false;
         
         int relacao = this.relacao(frase2);
         
         if (relacao == 0)
             isEqual = true;
         
         return isEqual;
     }
     
     public boolean isNotEqualTo(C08HugeInteger frase2){
         boolean isNotEqual = !this.isEqualTo(frase2);
        
         return isNotEqual;
     }
     
     public boolean isGreaterThan(C08HugeInteger frase2){
         boolean isGreaterThan = false;
         int relacao = this.relacao(frase2);
         
         if(relacao > 0)
             isGreaterThan = true;
         
         return isGreaterThan;
     }
     
     public boolean isGreaterThanOrEqualTo(C08HugeInteger frase2){
         boolean isGreaterThanOrEqualTo = false;
         
         int relacao = this.relacao(frase2);
         if (relacao >= 0)
             isGreaterThanOrEqualTo = true;
         return isGreaterThanOrEqualTo;
     }
     
     public boolean isLessThan(C08HugeInteger frase2){
         boolean isLessThan = false;
         int relacao = this.relacao(frase2);
         
         if(relacao < 0)
             isLessThan = true;
         return isLessThan;
     }
     
     public boolean isLessThanOrEqualTo(C08HugeInteger frase2){
         boolean isLessThanOrEqualTo = false;
         int relacao = this.relacao(frase2);
         
         if (relacao <= 0)
             isLessThanOrEqualTo = true;
         return isLessThanOrEqualTo;
     }    
     
}
