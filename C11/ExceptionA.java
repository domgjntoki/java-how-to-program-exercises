package C11;

/**
 *
 * @author Fredson Sumi
 */
public class ExceptionA extends Exception{
    public ExceptionA(){
        super();
    }
    
    public ExceptionA(String message){
        super(message);
    }
    
    public ExceptionA(Throwable cause){
        super(cause);
    }
    
    public ExceptionA(String message, Throwable cause){
        super(message, cause);
    }
}
