package lahiasa.at03;

import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        int[] tableau = new int[5]; // Déclaration d’un tableau de longueur 5
        Random random = new Random();

        // Remplissage du tableau avec des nombres aléatoires entre 0 et 100
        System.out.println("Valeurs du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(101); // 0 à 100 inclus
            System.out.println("tableau[" + i + "] = " + tableau[i]);
        }

        // Initialisation des valeurs min et max
        int min = tableau[0];
        int max = tableau[0];
        int posMin = 0;
        int posMax = 0;

        // Recherche des valeurs min et max et de leurs positions
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i];
                posMin = i;
            }
            if (tableau[i] > max) {
                max = tableau[i];
                posMax = i;
            }

        }
        // Affichage des résultats
        System.out.println("Valeur minimale : " + min + " à la position " + posMin);
        System.out.println("Valeur maximale : " + max + " à la position " + posMax);
        
    }
}
