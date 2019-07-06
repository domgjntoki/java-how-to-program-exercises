package C07Arrays;

public class ArrayVendasTotais {
    public static void main(String[] args) {
        /*
        Cada coluna representando um vendedor particular e cada linha 
        representando um produto particular. Some cada linha para obter o total 
        das vendas de cada produto no último mês. Some cada coluna para obter o 
        total de vendas por vendedor no último mês. Sua saída tabular deve 
        incluir esses totais cruzados à direita das linhas totalizadas e na
        parte inferior das colunas totalizadas.
        
                  Vendedor 1 Vendedor 2 Vendedor 3 Vendedor4
        Produto 1    03          02        01       06        12  Valor em R$*
        Produto 2    01          02        03       06        12  Valor em R$*
        Produto 3    00          01        02       02        05  Valor em R$*
        Produto 4    04          05        06       03        18  Valor em R$*
        Produto 5    05          03        04       02        14  Valor em R$*
                     13          13        15       19
        * Só precisa dos totais na vdd...
        */
                              // Produtos      
        double[][] vendas = {{3,2, 1, 6, 
                              1, 2, 3, 6,
                              0, 1, 2, 2,
                              4, 5, 6, 3,    // Vendedor
                              5, 3, 4, 2}, {19, 15, 13, 13}};            
        
        double[] precos = {12.5, 7.6, 8.6, 9.7, 8.89};
        
        System.out.println("Vendedor 1 Vendedor 2 Vendedor 3 Vendedor 4");  
        
        int preco = 0;
        int i = 0;
        double total = 0;
        double valor;
        for (double[]produtos : vendas){
            
            for(double produto : produtos){
                valor = produto * precos[preco];
                System.out.printf("%4s%6.2f ","R$", valor);
                i++;
                total += valor;
                if (i % 4 == 0){
                    System.out.printf("  %.1f", total);
                    System.out.println(preco);
                    //System.out.print("Produto " + (preco + 1));
                    total = 0;
                    if (preco < 4)
                        preco++;
                }
            }
        }
            
    }
}
