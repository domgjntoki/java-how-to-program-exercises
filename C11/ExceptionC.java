package C11;

/**
 *
 * @author Fredson Sumi
 */
public class ExceptionC extends ExceptionB{
    public ExceptionC(){
        super();
    }
    
    public ExceptionC(String message){
        super(message);
    }
    
    public ExceptionC(Throwable cause){
        super(cause);
    }
    
    public ExceptionC(String message, Throwable cause){
        super(message, cause);
    }
}
