package lahiasa.TP1;

import java.util.Scanner;

public class Numero2 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrez une somme d'Argent ");
        double montant = clavier.nextDouble();

          int cents = (int) Math.round(montant * 100);

        int[] valeurs = {10000, 5000, 2000, 1000, 500, 200, 100, 25, 10, 5, 1};
        String[] noms = {
            "Billets de 100$",
            "Billets de 50$",
            "Billets de 20$",
            "Billets de 10$",
            "Billets de 5$",
            "Billets de 2$",
            "Pièces de 1$",
            "Pièces de 0.25$",
            "Pièces de 0.10$",
            "Pièces de 0.05$",
            "Pièces de 0.01$"
        };

        System.out.println("\nRépartition minimale :");
        int total = 0;

        for (int i = 0; i < valeurs.length; i++) {
            int nb = cents / valeurs[i];
            if (nb > 0) {
                System.out.println(nb + " " + noms[i]);
                total += nb;
                cents %= valeurs[i];
            }
        }
        System.out.println("Total des billets et pièces : " + total);
        clavier.close();
        
    }
} 

