package lahiasa.at03;
import java.util.Arrays;
import java.util.Random;
public class Exercise3 {
    public static void main(String[] args) {
        int longueurTableau = 5; // On utilise 5 pour l'exemple, vous pouvez changer

        // 1. Déclaration et création des deux tableaux
        int[] tableauOriginal = new int[longueurTableau];
        int[] tableauInverse = new int[longueurTableau];
        
        Random random = new Random();
        
        // 2. Remplissage du tableau original avec des nombres aléatoires
        for (int i = 0; i < tableauOriginal.length; i++) {
            tableauOriginal[i] = random.nextInt(101); 
        }
        
        // 3. Inversion des éléments dans le nouveau tableau
        for (int i = 0; i < tableauOriginal.length; i++) {
            int indexInverse = longueurTableau - 1 - i;
            tableauInverse[indexInverse] = tableauOriginal[i];
        }
        
        // 4. Affichage des deux tableaux
        System.out.println("Tableau original : " + Arrays.toString(tableauOriginal));
        System.out.println("Tableau inversé  : " + Arrays.toString(tableauInverse));
    }
}