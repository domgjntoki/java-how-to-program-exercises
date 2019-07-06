package C07Arrays;

public class ArrayTable {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 3;
        
        int[][] table = new int[ARRAY_SIZE][ARRAY_SIZE];
        
        for (int x = 0; x < table.length; x++){
            for(int y = 0; y < table[x].length; y++)
                table[x][y] = x + y;
        } 
        int i = 0;
        for ( int tables[] : table) 
        {
            for (int value : tables){
                System.out.printf("%d ", value); 
                i++;
                if (i % 3 == 0)
                   System.out.println("");
            }
        }
                
            
    }
}
