package lahiasa.at03;
import java.util.Random;
public class Exercise6 {

    public static void main(String[] args) {
        // ======= Partie A =======
        int[] tabA = {-65, -34, 7, -3, -43, 14, 23, -9, 45, 11};

        int sommePos = 0;
        int sommeNeg = 0;

        for (int i = 0; i < tabA.length; i++) {
            if (tabA[i] > 0)
                sommePos += tabA[i];
            else
                sommeNeg += tabA[i];
        }

        System.out.println("=== Partie A ===");
        System.out.println("Somme positifs : " + sommePos);
        System.out.println("Somme négatifs : " + sommeNeg);

        // ======= Partie B =======
        int[] tabB = new int[10];
        Random rand = new Random();

        for (int i = 0; i < tabB.length; i++) {
            tabB[i] = rand.nextInt(201) - 100; // entre -100 et 100
        }

        sommePos = 0;
        sommeNeg = 0;

        for (int i = 0; i < tabB.length; i++) {
            if (tabB[i] > 0)
                sommePos += tabB[i];
            else
                sommeNeg += tabB[i];
        }

        System.out.println("\n=== Partie B ===");
        System.out.print("Tableau aléatoire : ");
        for (int i = 0; i < tabB.length; i++) {
            System.out.print(tabB[i] + " ");
        }

        System.out.println("\nSomme positifs : " + sommePos);
        System.out.println("Somme négatifs : " + sommeNeg);
    }
}

