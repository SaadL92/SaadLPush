package lahiasa.TP1;

import java.util.Scanner;

public class Numeor1 {
    public static void main(String[] args) {
         Scanner clavier = new Scanner(System.in);
        System.out.println("TRAVAIL PRATIQUE #1 - Saad Lahia\r\n" + //
                "-------------------------------\r\n" + //
                "");

        System.out.println("1) Transformer $$$ en monnaie ");
        System.out.println("2) Jeu trouver un nombre mystère");
        System.out.println("3) Quitter");
        int choix = clavier.nextInt();
        
        while (choix < 1 || choix > 3) {
            System.out.println("Choix invalide. Veuillez choisir une option entre 1 et 3.");
            choix = clavier.nextInt();
            if (choix == 1) {
                System.out.println("Vous avez choisi l'option numéro : " + choix);
            } else if (choix == 2) {
                System.out.println("Vous avez choisi l'option numéro : " + choix);
            } else if (choix == 3) {
                clavier.close();
            }
            
        }
        
    }
}
