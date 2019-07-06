package C11;

/**
 *
 * @author Fredson Sumi
 */
public class UsingChainedExceptions {
    public static void main(String[] args) {
        try{
            method1();
        }
        
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
    
    public static void method1() throws Exception{
        try{
            method2();
        }
        
        catch(Exception e){
            throw new Exception("Exception thrown in method 1", e);
        }
    }    
    
    public static void method2()throws Exception{
        try{
            method3();
        }
        catch(Exception e){
            throw new Exception("Exception thrown in method 2", e);
        }
    }
    public static void method3() throws Exception{
        throw new Exception("Exception thrown in method 3");
    }
}
