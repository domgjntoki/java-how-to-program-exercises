package C18Recursao;

/**
 *
 * @author Fredson Sumi
 */
public class TowersOfHanoi {
    public static void solveTowers(int disks, int sourcePeg,
        int destinationPeg, int tempPeg) {
        
        // caso básico -- somente um disco a ser movido
        if(disks == 1){
            System.out.printf("%n%d --> %d", sourcePeg, destinationPeg);
            return;
        }
        
        // passo recursivo -- move os discos (disco - 1) do sourcePeg
        // para tempPeg usando destinationPeg
        solveTowers(disks - 1, sourcePeg, tempPeg, destinationPeg);
        
        // move o último disco de sourcePeg para destinationPeg
        System.out.printf("%n%d --> %d", sourcePeg, destinationPeg);
        
        // move (disks - 1) discos de tempPeg para destinationPeg
        solveTowers(disks - 1, tempPeg, destinationPeg, sourcePeg);
        
    }
    
    public static void main(String[] args) {
        int startPeg = 1;
        int endPeg = 3;
        int tempPeg = 2;
        int totalDisks = 3;
        
        solveTowers(totalDisks, startPeg, endPeg, tempPeg);
        System.out.println();
    }
}
