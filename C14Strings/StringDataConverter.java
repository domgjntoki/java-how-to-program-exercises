package C14Strings;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Fredson Sumi
 */
public class StringDataConverter {
    public static void main(String[] args) {
        // 25/04/1955 e 25 de Abril de 1955
        Scanner input = new Scanner(System.in);
        String[] meses = {"","Janeiro", "Fevereiro", "Março", "Abril",
            "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro",
            "Novembro", "Dezembro"};
        
        System.out.print("Insira uma data (formato (DD/MM/AAAA): ");
        String data = input.nextLine();
                
        String[] dataSeparada = data.split("/");
        if(data.matches("(0?[1-9]|[1-2][0-9]|3[0-1])/(0?[1-9]|1[0-2])/\\d{4}")){
            System.out.printf("%02d de %s de %s%n", 
                    Integer.parseInt(dataSeparada[0]), 
                    meses[Integer.parseInt(dataSeparada[1])], 
                    dataSeparada[2]);
            
        }
        
        else
            System.err.println("Formato inválido");
    }
}
