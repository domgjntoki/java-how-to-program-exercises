package C11;

/**
 *
 * @author Fredson Sumi
 */
public class ExceptionB extends ExceptionA{
    public ExceptionB(){
        super();
    }
    
    public ExceptionB(String message){
        super(message);
    }
    
    public ExceptionB(Throwable cause){
        super(cause);
    }
    
    public ExceptionB(String message, Throwable cause){
        super(message, cause);
    }
}
