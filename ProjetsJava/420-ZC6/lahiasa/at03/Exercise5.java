package lahiasa.at03;

import java.util.Random;

public class Exercise5 {
    public static void main(String[] args) {
        int[] tableau = new int[10]; // Déclaration d’un tableau de longueur 5
        Random random = new Random();

        // Remplissage du tableau avec des nombres aléatoires entre 0 et 100
        System.out.println("Valeurs du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(101); // 0 à 100 inclu
        }

        System.out.println("Tableau initial :");
        afficherTableau(tableau);

        // Inversion des cases du tableau
        inverserTableau(tableau);

        System.out.println("\nTableau après permutation :");
        afficherTableau(tableau);
    }

    // Méthode paramétrée pour afficher le tableau
    public static void afficherTableau(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println(); // retour à la ligne après l’affichage
    }

    public static void inverserTableau(int[] tab) {
        int n = tab.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = tab[i];
            tab[i] = tab[n - 1 - i];
            tab[n - 1 - i] = temp;
        }
    }
}