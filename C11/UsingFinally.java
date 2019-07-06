package C11;

/**
 *
 * @author Fredson Sumi
 */
public class UsingFinally {
    public static void main(String[] args) {
        
        try{
            throwException();
        }
        
        catch (Exception e){
            System.out.println("Exception handled in main");
        }
        
        doesNotThrowException();
    }
    
    // demonstra try...catch...finally
    public static void throwException()throws Exception{
        // lança uma exceção e imediatamente a captura
        try{ 
            System.out.println("Method throw exception");
            throw new Exception();
        }
        
        // captura exceção lançada em try
        catch(Exception e){ 
            System.out.println("Exception handled in method throwException");
            throw e;
            
            // o código aqui não seria alcançado; poderia causar erros de compilação
        }
        
        // executa independentemente do que ocorre em try...catchÿ
        finally{
            System.out.println("Finally executed in throwException");
        }
        
        // o código aqui não seria alcançado; poderia causar erros de compilação
    }
    
    // demonstra finally quando nenhuma exceção ocorrer
    public static void doesNotThrowException(){
        // bloco try não lança uma exceção
        try{
            System.out.println("Method doesNotThrowException");
        }
        
        // não executa
        catch(Exception e){
            System.out.println(e);
        }
        
        // executa independentemente do que ocorre em try...catchÿ
        finally{
            System.out.println("Finally executed in method doesNotThrowException");
        }
        
        System.out.println("End of method doesNotThrow Exception");
    }
}
