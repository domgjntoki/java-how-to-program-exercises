package C11;

/**
 *
 * @author Fredson Sumi
 */
public class SomeClass {
    public static void main(String[] args) {
        try{
        SomeClass a = new SomeClass();
        }
        catch(Exception e){
            System.out.println("exception");
        }
    }
    public SomeClass() throws Exception{
        throw new Exception();
    }
}
