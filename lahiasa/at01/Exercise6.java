package lahiasa.at01;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        // --- Partie 1 : Lire deux nombres et afficher le plus grand ---
        System.out.print("Entrez le premier nombre : ");
        double nombre1 = clavier.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = clavier.nextDouble();

        if (nombre1 > nombre2) {
            System.out.println("Le plus grand nombre est : " + nombre1);
        } else if (nombre2 > nombre1) {
            System.out.println("Le plus grand nombre est : " + nombre2);
        } else {
            System.out.println("Les deux nombres sont égaux.");
        }

        System.out.println("\n=== Estimation Plancher BoisFranc ===");

        clavier.nextLine(); // Vider le buffer

        // --- Partie 2 : Lire les informations du client ---
        System.out.print("Entrez le nom du client : ");
        String nomClient = clavier.nextLine();

        System.out.println("Choisissez le type de plancher :");
        System.out.println("1 - Chêne");
        System.out.println("2 - Érable");
        System.out.println("3 - Pin");
        System.out.print("Votre choix (1, 2 ou 3) : ");
        int typePlancher = clavier.nextInt();

        System.out.println("Vous avez choisi le type de plancher numéro : " + typePlancher);

        double prixParMetre;

        // Déterminer le prix selon le type
        if (typePlancher == 1) { prixParMetre = 5.0;} 
        else if (typePlancher == 2) {prixParMetre = 12.0;} 
        else if (typePlancher == 3) {prixParMetre = 10.0;} 
        else {
            System.out.println("Vous navez pas choisi le bon type de plancher. Veuillez réessayer.");
            clavier.close();
            return;
        }

        // --- Lire la longueur et la largeur ---
        System.out.print("Entrez la longueur du plancher (mètres) : ");
        double longueur = clavier.nextDouble();

        System.out.print("Entrez la largeur du plancher (mètres) : ");
        double largeur = clavier.nextDouble();

        // --- Calculs ---
        double aire = longueur * largeur;
        double prixTotal = aire * prixParMetre;

        // --- Affichage du résultat ---
        System.out.println("\n--- Résumé du devis ---");
        System.out.println("Client : " + nomClient);
        System.out.println("Surface du plancher : " + aire + " m²");
        System.out.println("Prix total : " + prixTotal + " $");

        clavier.close();
    }
}



