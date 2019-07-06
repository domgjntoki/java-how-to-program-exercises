package C07Arrays;

public class CavaloXadrez {

    public static void main(String[] args) {
        int[][] board = new int[8][8];
        int[] horizontal = new int[8];
        int[] vertical = new int[8];
        /*
        accessibility
        2 3 4 4 4 4 3 2
        3 4 6 6 6 6 4 3
        4 6 8 8 8 8 6 4
        4 6 8 8 8 8 6 4
        4 6 8 8 8 8 6 4
        4 6 8 8 8 8 6 4
        3 4 6 6 6 6 4 3
        2 3 4 4 4 4 3 2
        */
        int[] accessibilityNumbers = {2, 3, 4, 4, 4, 4, 3, 2, 
                                      3, 4, 6, 6, 6, 6, 4, 3, 
                                      4, 6, 8, 8, 8, 8, 6, 4, 
                                      4, 6, 8, 8, 8, 8, 6, 4, 
                                      4, 6, 8, 8, 8, 8, 6, 4, 
                                      4, 6, 8, 8, 8, 8, 6, 4, 
                                      3, 4, 6, 6, 6, 6, 4, 3, 
                                      2, 3, 4, 4, 4, 4, 3, 2};
        
        int[][] accessibility = new int[8][8];
        int numero = 0;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                accessibility[i][j] = accessibilityNumbers[numero];
                numero++;
            }
        }
        
        
        horizontal[0] = 2;  vertical[0] = -1;
        horizontal[1] = 1;  vertical[1] = -2;
        horizontal[2] = -1; vertical[2] = -2;
        horizontal[3] = -2; vertical[3] = -1;
        horizontal[4] = -2; vertical[4] = 1;
        horizontal[5] = -1; vertical[5] = 2;
        horizontal[6] = 1;  vertical[6] = 2;
        horizontal[7] = 2;  vertical[7] = 1;

        int currentRow = 0;
        int currentColumn = 0;
        int movimentos = 1;
        board[4][4] = 1;
        for (int c = 1; c <= 999999; c++) {
            int linhaTeste;
            int colunaTeste;
            int acessibilidadeAntiga = 9;
            
            int primeiraRow = currentRow;
            int primeiraColumn = currentColumn;
            
            for (int i = 0; i < 8; i++) {
                
                if (currentRow + horizontal[i] < 8
                        && currentRow + horizontal[i] >= 0) {

                    if (currentColumn + vertical[i] < 8
                            && currentColumn + vertical[i] >= 0) {
                       
                        linhaTeste = currentRow + horizontal[i];
                        colunaTeste = currentColumn + vertical[i];
                        
                        int acessibilidade = 
                                accessibility[linhaTeste][colunaTeste];
                        
                        if(acessibilidade < acessibilidadeAntiga ){
                            currentRow = primeiraRow;
                            currentColumn = primeiraColumn;
                            currentRow = linhaTeste;
                            currentColumn = colunaTeste;
                            
                            movimentos++;
                            board[currentRow][currentColumn] = movimentos;
                            System.out.printf("Movimento %d%n", movimentos);
                            System.out.printf("Tipo de movimento: %d%n", i);
                            showBoard(board);
                            System.out.println("");
                        }
                        
                        acessibilidadeAntiga = acessibilidade;

                    }
                }
                
                
                
            }
        }

    }

    public static void showBoard(int[][] board) {
        for (int linha = 0; linha < 8; linha++) {
            for (int coluna : board[linha]) {
                if (coluna == 0) {
                    System.out.printf("%03d ", coluna);
                } else {
                    System.out.printf("\033[32;1m%03d\033[m ", coluna);
                }

            }

            System.out.println();
        }
    }
}
