package C11;

/**
 *
 * @author Fredson Sumi
 */
public class ExceptionsABCTest {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            throw new ExceptionC();
        }
        
        catch(ExceptionA e){
            System.out.println("Exception A");
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}
