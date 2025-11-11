package lahiasa.TP1;

import java.util.Scanner;

public class tp2 {
    // Tableaux pour chaque équipe : PJ, V, D, N, PTS
    static int[] MON = new int[5]; // Junior de Montréal
    static int[] QUE = new int[5]; // Remparts de Québec
    static int[] LAV = new int[5]; // Aigles de Laval
    static int[] TER = new int[5]; // Éperviers de Terrebonne

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuer;

        System.out.println("TRAVAIL PRATIQUE #3 - Votre Nom");
        System.out.println("--------------------------------");

        do {
            entrerResultatMatch(sc);
            System.out.print("Voulez-vous continuer ? (O/N) : ");
            continuer = sc.nextLine().trim().toLowerCase();
        } while (continuer.equals("o"));

        afficherClassement();
        sc.close();
    }

    // Méthode pour demander les résultats de chaque match
    public static void entrerResultatMatch(Scanner sc) {
        String visiteur, local;
        int butsVisiteur, butsLocal;

        System.out.print("Équipe visiteuse (MON, QUE, LAV, TER ou fin) : ");
        visiteur = sc.nextLine().trim()/*Permette de supprimer les esapaces au debut */.toUpperCase();
        if (visiteur.equals("FIN")) {
            return;
        }

        System.out.print("Nombre de buts : ");
        butsVisiteur = Integer.parseInt(sc.nextLine());

        System.out.print("Équipe locale (MON, QUE, LAV, TER) : ");
        local = sc.nextLine().trim().toUpperCase();

        if (local.equals(visiteur)) {
            System.out.println("Erreur : les deux équipes ne peuvent pas être les mêmes !");
            return;
        }

        System.out.print("Nombre de buts : ");
        butsLocal = Integer.parseInt(sc.nextLine());

        // Mettre à jour les stats
        int[] statsVisiteur = getEquipe(visiteur);
        int[] statsLocal = getEquipe(local);

        statsVisiteur[0]++; // PJ
        statsLocal[0]++;

        if (butsVisiteur > butsLocal) {
            statsVisiteur[1]++; // V
            statsLocal[2]++;    // D
        } else if (butsVisiteur < butsLocal) {
            statsLocal[1]++;    // V
            statsVisiteur[2]++; // D
        } else {
            statsVisiteur[3]++; // N
            statsLocal[3]++;
        }

        // Calcul des points
        calculerPoints(statsVisiteur);
        calculerPoints(statsLocal);

        System.out.println();
    }

    // Méthode pour récupérer le tableau correspondant à une équipe
    public static int[] getEquipe(String nom) {
        switch (nom) {
            case "MON":
                return MON;
            case "QUE":
                return QUE;
            case "LAV":
                return LAV;
            case "TER":
                return TER;
            default:
                return null;
        }
    }

    // Méthode pour calculer les points
    public static void calculerPoints(int[] stats) {
        stats[4] = stats[1] * 3 + stats[3]; // PTS = V*3 + N
    }

    // Méthode pour afficher le classement
    public static void afficherClassement() {
        System.out.println("\nClassement\n");
        System.out.println("Équipe                PJ  V  D  N  PTS");
        System.out.println("--------------------------------------");
        afficherEquipe("Junior Montreal", MON);
        afficherEquipe("Remparts Quebec", QUE);
        afficherEquipe("Aigles Laval", LAV);
        afficherEquipe("Éperviers Terrebonne", TER);
    }

    public static void afficherEquipe(String nom, int[] stats) {
        System.out.printf("%-22s %2d %2d %2d %2d %3d\n",
                nom, stats[0], stats[1], stats[2], stats[3], stats[4]);
    }
}
