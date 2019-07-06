package C08;
import java.util.Arrays;

public class C08Date {
    private int dia;
    private int mes;
    private int ano;
    private int dias;
    private static final int[] DIAS_POR_MES = 
            {0 , 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] MESES_STRING = 
            {"", "janeiro", "fevereiro", "março", "abril", "maio", "junho",
             "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
    
    public C08Date(int dia, int mes, int ano){
        boolean bissexto = eBissexto(ano);
        
        if(mes <= 0 || mes > 12)
            throw new IllegalArgumentException("Mês fora do intervalo(1 - 12)");
        
        if((dia <= 0 || dia > DIAS_POR_MES[mes]) && !(dia == 29 && mes == 2)){
            throw new IllegalArgumentException("Dia fora do intervalo (1 - " +
                    DIAS_POR_MES[mes] + ")");
        }
        
        if ((dia == 29 && mes == 2) && bissexto == false){
            throw new IllegalArgumentException
                    ("Dia fora do intervalo (1 - 29)");
        }
        
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public C08Date( int dia, String mesLetra, int ano){
        boolean mesValido = false;
        boolean bissexto = eBissexto(ano);
        
        for(int i = 1; i <= 12; i++){
            if(mesLetra.equals(MESES_STRING[i])){
                mes = i;
                mesValido = true;
            }
        }
        
        if (mesValido == false){
            throw new IllegalArgumentException("O mês " + mesLetra + "não é "
                    + "válido");
        }
               
        if((dia <= 0 || dia > DIAS_POR_MES[mes]) && !(dia == 29 && mes == 2)){
            throw new IllegalArgumentException("Dia fora do intervalo (1 - " +
                    DIAS_POR_MES[mes] + ")");
        }
        
        if ((dia == 29 && mes == 2) && bissexto == false ){
            throw new IllegalArgumentException
                    ("Dia fora do intervalo (1 - 29)");
        }
        
        this.ano = ano;
        this.dia = dia;
    }
    
    public C08Date(int dias, int ano){
        boolean bissexto = eBissexto(ano);
        int ultimoDia = 0;
        int mes = 0;
        for(int i = 1; dias > 0; i++){
            ultimoDia = dias;
            if (i == 2 && bissexto == true)
                dias -= 29;
            else
                dias -= DIAS_POR_MES[i];
            mes = i;
        }
        
        if (dias > 365 && bissexto == false){
            throw new IllegalArgumentException("O número máximo de dias é 365");
        }
        
        else if (dias > 366)
            throw new IllegalArgumentException("O número máximo de dias é 366");
        
        this.mes = mes;
        this.ano = ano;
        this.dia = ultimoDia;
    }
    
    public static boolean eBissexto(int ano){
        boolean bissexto = false;
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)){
            bissexto = true;
        }
        return bissexto;
    }
    
    public String formatoPadrao(){
        return String.format("%02d/%02d/%d", dia, mes, ano);
    }
    
    public String formatoMesLetra(){
        String mesLetra = MESES_STRING[mes];
        return String.format("%02d de %s de %d", dia, mesLetra, ano);
    }
    
    public String formatoDiasAno(){
        int dias = dia;
        boolean bissexto = eBissexto(ano);
        for(int i = 1; i < mes; i++){
            if (i == 2 && bissexto == true)
                dias += 29;
            else
                dias += DIAS_POR_MES[i];
        }
        return String.format("%d %d", dias, ano);
    }
    
    public int getDia(){return dia;}
    public int getMes(){return mes;}
    public int getAno(){return ano;}
}
