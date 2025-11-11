package lahiasa.TP1;

import java.util.ArrayList;
import java.util.Scanner;

public class livre {
      public static void main(String[] args) {
        ArrayList<String> livres = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n1 - Ajouter un livre");
            System.out.println("2 - Afficher tous les livres");
            System.out.println("3 - Supprimer un livre");
            System.out.println("0 - Quitter");
            System.out.print("Votre choix : ");
            choix = Integer.parseInt(sc.nextLine());

            if (choix == 1) {
                System.out.print("Titre du livre : ");
                String titre = sc.nextLine();
                livres.add(titre);
                System.out.println("Livre ajouté !");
            } 
            else if (choix == 2) {
                System.out.println("Livres :");
                for (String livre : livres) {
                    System.out.println("- " + livre);
                }
            } 
            else if (choix == 3) {
                System.out.print("Titre du livre à supprimer : ");
                String titre = sc.nextLine();
                if (livres.remove(titre)) {
                    System.out.println("Livre supprimé !");
                } else {
                    System.out.println("Livre non trouvé !");
                }
            } 
            else if (choix != 0) {
                System.out.println("Choix invalide !");
            }

        } while (choix != 0);

        System.out.println("Au revoir !");
    }
}
