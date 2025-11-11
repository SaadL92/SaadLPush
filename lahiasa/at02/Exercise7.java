
package lahiasa.at02;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int nbVoyelles = 0;
        int nbConsonnes = 0;

        // Entrez une phrase
        System.out.print("Entrez une phrase ou un mot : ");
        String texte = clavier.nextLine();
        for (int Nombre = 0; Nombre < texte.length(); Nombre++) {
            char caractere = texte.charAt(Nombre);

            // Vérifier si le caractère est une voyelle
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u'
                    || caractere == 'y') {
                nbVoyelles++;
            } else {
                // Sinon, c'est une consonne
                nbConsonnes++;
            }

            // Les espaces, chiffres et caractères spéciaux sont ignorés
        }

        System.out.println("Nombre de voyelles : " + nbVoyelles);
        System.out.println("Nombre de consonnes : " + nbConsonnes);

        clavier.close();
    }

}
