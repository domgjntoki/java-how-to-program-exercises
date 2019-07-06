package C11;

/**
 *
 * @author Fredson Sumi
 */
public class UsingExceptions {
    public static void main(String[] args) {
        try{
            method1();
        }
        
        catch (Exception exception){
            System.err.println(exception.getMessage());
            exception.printStackTrace();
          //  System.err.printf("%s%n%n", exception.getMessage());


            
            StackTraceElement[] traceElements = exception.getStackTrace();
            
            System.out.printf("%nStack trace fom getStackTrace:%n");
            System.out.println("Class\t\t\t\t\tFile\t\t\tLine\tMethod");
            
            for (StackTraceElement traceElement : traceElements) {
                System.out.printf("%s\t", traceElement.getClassName());
                System.out.printf("%s\t", traceElement.getFileName());
                System.out.printf("%s\t", traceElement.getLineNumber());
                System.out.printf("%s\t%n", traceElement.getMethodName());
            }
        }
    }
    
    public static void method1() throws Exception{
        method2();
    }    
    
    public static void method2()throws Exception{
        method3();
    }
    public static void method3() throws Exception{
        throw new Exception("Exception thrown in method 3");
    }
}
