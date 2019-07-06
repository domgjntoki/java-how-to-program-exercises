package C07Arrays;

public class ArrayComissoesVendas {
    public static void main(String[] args) {
        
        /*
        (Comissões de vendas) Utilize um array unidimensional para resolver o 
        seguinte problema: uma empresa paga seu pessoal de vendas por comissão. 
            O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas 
        brutas durante essa semana. Por exemplo, um vendedor ue vende R$ 5.000 
        brutos em uma semana recebe R$ 200 mais 9% de R$ 5.000 ou um total de 
        R$ 650. 
            Escreva um aplicativo (utilizando um array de contadores) que 
        determina quanto o pessoal de vendas ganhou em cada um dos seguintes 
        intervalos (suponha que o salário de cada vendedor foi truncado para uma
        quantia inteira):
        a) $200–299
        b) $300–399
        c) $400–499
        d) $500–599
        e) $600–699
        f) $700–799
        g) $800–899
        h) $900–999
        i) R$ 1.000 e acima
        Resuma os resultados em formato tabular.
        */
        int[] vendas = {5000, 4500, 12000, 3300, 4500, 2340, 1000, 8670, 9900,
        1500, 3500, 17000, 0, 300, 7000};
        int[] faixaVendas = new int [11];
        
        for (int i = 0; i < vendas.length; i++){
            // Adicionar ao índice faixaVendas do cálculo das vendas dividido
            // por 100. Ex: 5000 * 0.09 + 200 / 100 = 850 / 100 = 8
            try{
                ++faixaVendas[(vendas[i] * 9 / 100 + 200) / 100];
                
            }
            // Se o calculo superar 10, adicionar à frequencia[10] (valores 
            // maiores que 1000).
            catch (ArrayIndexOutOfBoundsException e){
                ++faixaVendas[10];
                
            }
        }
        
        
        System.out.printf("Faixa de Vendas: %n");
        for (int i = 2; i < faixaVendas.length; i++){
            if (i==10){
                System.out.printf("%10s%d", "$1000+: ", faixaVendas[i]);
            }
            else           
                System.out.printf("$%03d-%03d: %d%n", 
                        i * 100, i * 100 + 99, faixaVendas[i]);
            
        }
        System.out.println("");
    }
}
