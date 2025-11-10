package lahiasa.at03;

import java.util.Random;

public class Exercise7 {
     public static void main(String[] args) {
        int[] tableau = new int[10];
        Random rand = new Random();

        // Remplir le tableau avec des nombres aléatoires entre 0 et 4
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = rand.nextInt(5); // 0 à 4
        }

        // Afficher le tableau
        System.out.print("Tableau : ");
        for (int n : tableau) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Créer un tableau pour stocker le nombre d'occurrences
        int[] occurrences = new int[5]; // index 0→4

        // Compter les occurrences en utilisant la méthode
        for (int i = 0; i < 5; i++) {
            occurrences[i] = compterOccurrences(tableau, i);
        }

        // Afficher le nombre d'occurrences
        afficherOccurrences(occurrences);
    }

    // Méthode pour compter le nombre d'occurrences d'un nombre donné
    public static int compterOccurrences(int[] tab, int valeur) {
        int count = 0;
        for (int n : tab) {
            if (n == valeur)
                count++;
        }
        return count;
    }

    // Méthode pour afficher les occurrences
    public static void afficherOccurrences(int[] occ) {
        for (int i = 0; i < occ.length; i++) {
            System.out.println("Nombre de " + i + " : " + occ[i]);
        }
    }

}
