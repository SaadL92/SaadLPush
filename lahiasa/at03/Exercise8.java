package lahiasa.at03;

public class Exercise8 {
    public static void main(String[] args) {
        // Noms des étudiants
        String[] noms = { "Pierre", "André", "Julie", "Brigitte", "Anne", "Olivier", "Simon", "Nadine" };

        // Notes des étudiants
        int[] TP1 = { 65, 78, 43, 82, 76, 91, 71, 96 };
        int[] TP2 = { 45, 55, 67, 89, 100, 95, 92, 81 };
        int[] Examen1 = { 34, 65, 21, 67, 75, 54, 69, 54 };

        // Calcul et affichage de la moyenne de chaque évaluation
        System.out.println("Moyenne TP1 : " + moyEval(TP1));
        System.out.println("Moyenne TP2 : " + moyEval(TP2));
        System.out.println("Moyenne Examen1 : " + moyEval(Examen1));
        System.out.println();

        // Calcul et affichage de la moyenne de chaque étudiant
        for (int i = 0; i < noms.length; i++) {
            double moyenne = (TP1[i] + TP2[i] + Examen1[i]) / 3.0;
            System.out.println(noms[i] + " ---­ Moyenne : " + moyenne);
        }
    }

    // Méthode pour calculer la moyenne d'une évaluation
    public static double moyEval(int[] notes) {
        int somme = 0;
        for (int n : notes) {
            somme += n;
        }
        return (double) somme / notes.length;
    }
}
