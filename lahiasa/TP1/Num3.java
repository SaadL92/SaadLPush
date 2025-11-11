package lahiasa.TP1;

import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nombreMax = 20;
        int nombreMystere = (int) (Math.random() * nombreMax) + 1; // entre 1 et 20
        int essaisMax = 7;
        int tentative = 0;
        boolean trouve = false;

        System.out.println("=== Jeu du nombre mystère ===");
        System.out.println("Devinez le nombre entre 1 et " + nombreMax + ".");
        System.out.println("Vous avez " + essaisMax + " chances.\n");

        while (tentative < essaisMax && trouve== false) {
            System.out.print("Essai " + (tentative + 1) + " : ");
            int choix = scanner.nextInt();
            tentative++;

            if (choix == nombreMystere) {
                trouve = true;
                System.out.println(" Bravo ! Vous avez trouvé le nombre mystère : " + nombreMystere + " !");
            } else if (choix < nombreMystere) {
                System.out.println("Le nombre mystère est plus grand.\n");
            } else {
                System.out.println("Le nombre mystère est plus petit.\n");
            }
        }

        if (trouve== false) {
            System.out.println("😢 Vous avez épuisé vos " + essaisMax + " chances.");
            System.out.println("Le nombre mystère était : " + nombreMystere);
        }

        scanner.close();
    }

}
