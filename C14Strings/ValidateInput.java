package C14Strings;

/**
 *
 * @author Fredson Sumi
 */
public class ValidateInput {
    public static boolean validateFirstName(String firstName){
       return firstName.matches("[A-za-záéíóú]+");
    }
    
    public static boolean validateLastName(String lastName){
        return lastName.matches("[a-zA-záéíóú]+(['-][a-zA-záéíóú]+)*");
    }
    
    public static boolean validateAddress(String address){
        return address.matches("\\d+\\s+([a-zA-z]+|[a-zA-z]+\\s+[a-zA-Z]+)");
    }
    
    public static boolean validateCity(String city){
        return city.matches("[a-zA-Z]+|[a-zA-Z]+\\s+[a-zA-Z]+");
    }
    
    public static boolean validateState(String state){
        return state.matches("[a-zA-Z]+|[a-zA-z]+\\s+[a-zA-Z]");
    }
    
    public static boolean validateZip(String zip){
        return zip.matches("\\d{5}");
    }
    
    public static boolean validatePhone(String phone){
        return phone.matches(
            // +55 ou 55, pode ser (071) (71) 071 ou 71
            "([+]?[\\d{2}]*)\\s*(\\(0?\\d{2}\\)|0*\\d{2})"
            // começo 9, 4 digitos, pode ou não - e 4 digitos
                    + "\\s*9[7-9]\\d{3}\\s*\\-?\\s*\\d{4}");
    }
    
}
