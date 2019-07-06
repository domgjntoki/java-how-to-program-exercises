package C11;

/**
 *
 * @author Fredson Sumi
 */
public class TestingTry {
    public static void main(String[] args) {
        try{
            System.out.println("Something");
            throw new Exception();
        }
        
        catch (Exception e){
            System.out.println("Some exception");
        }
    }
}
