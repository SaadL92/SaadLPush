package lahiasa.at02;

import java.util.Scanner;

public class Exercise8 {
          public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        String mot, premier = "", dernier = "";
        boolean premierMot = true;

        System.out.println("Entrez des mots (tapez 'stop' pour arrêter) :");

        while (true) { //elle répète les instructions à l’intérieur jusqu’à ce qu’on écrive “stop”.
            mot = clavier.nextLine();//elle répète les instructions à l’intérieur jusqu’à ce qu’on écrive “stop”.

            if (mot.equalsIgnoreCase("stop")) {//Si le mot tapé est “stop” (peu importe les majuscules/minuscules), sa quitte la boucle.
                break;
            }

            if (premierMot) {
                premier = mot; //initialise le premier et le dernier mot avec le premier mot saisi
                dernier = mot;
                premierMot = false;
                
            } else {
                if (mot.compareToIgnoreCase(premier) < 0) { //compare les mots en ignorant la casse
                    premier = mot;
                }
                if (mot.compareToIgnoreCase(dernier) > 0) {
                    dernier = mot;
                }
            }
        }

        if (premierMot) {
            System.out.println("Aucun mot saisi.");
        } else {
            System.out.println("Premier mot : " + premier);
            System.out.println("Dernier mot : " + dernier);
        }

        clavier.close();
    }
}


