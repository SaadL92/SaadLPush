package lahiasa.at03;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        double[] TableauNum = new double[11];
        Scanner clavier = new Scanner(System.in);
        
        for (int indice = 0; indice < 10; indice++) {
            System.out.print("Entrez un nombre réel pour l'indice numero "+indice + ":");
            TableauNum[indice] = clavier.nextDouble();
        }

        // Affichage du tableau
        System.out.println("Voici le contenu du tableau :");
        for (int i = 0; i < 10; i++) {
            System.out.println("tableau[" + i + "] = " + TableauNum[i]);
        }
        clavier.close();
    }

}
