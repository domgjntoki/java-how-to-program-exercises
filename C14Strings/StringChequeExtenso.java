package C14Strings;

/**
 *
 * @author Fredson Sumi
 */
public class StringChequeExtenso {
    public static void main(String[] args) {
        // 112,43 = ONE hundred TWELVE and 43/100 
        String number = "113,43";
        String[] u = {"","one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten"};
        String[] d = {"","ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety", 
                "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen"};

        
        String inteiros = number.substring(0, number.indexOf(","));
        
        
        switch (inteiros.length()) {
            case 3:
                Integer dezena = Integer.parseInt(inteiros.substring(1, 3));
                System.out.println(dezena);
                if(dezena > 10 && dezena < 20){
                    System.out.printf("%s hundred %s and %s/100%n",
                        u[Integer.parseInt(inteiros.substring(0, 1))],
                        d[dezena - 1],
                        number.substring(number.indexOf(",") + 1));
                }
                else
                    System.out.printf("%s hundred %s %s and %s/100%n",
                        u[Integer.parseInt(inteiros.substring(0, 1))],
                        d[Integer.parseInt(inteiros.substring(1, 2))],
                        u[Integer.parseInt(inteiros.substring(2, 3))],
                        number.substring(number.indexOf(",") + 1));
                
                break;
            case 2:
                Integer dezena2 = Integer.parseInt(inteiros.substring(0, 2));
                if(dezena2 > 10 && dezena2 < 20){
                    System.out.printf("%s and %s/100%n",
                        d[dezena2 - 1],
                        number.substring(number.indexOf(",") + 1));
                }
                else
                    System.out.printf("%s %s and %s/100%n",
                        d[Integer.parseInt(inteiros.substring(1, 2))],
                        u[Integer.parseInt(inteiros.substring(2, 3))],
                        number.substring(number.indexOf(",") + 1));
                break;
            default:
                System.out.printf("%s and %s/100%n",
                    u[Integer.parseInt(inteiros.substring(2, 3))],
                        number.substring(number.indexOf(",") + 1));
                break;
        }
            
    }
}
