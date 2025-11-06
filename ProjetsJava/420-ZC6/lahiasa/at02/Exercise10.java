package lahiasa.at02;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args)
    {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entre un nombre entier : ");
        int nombre1 = clavier.nextInt(); // lire un nombre entier

        System.out.println("Entre un deuxieme nombre entier : ");
        int nombre2 = clavier.nextInt(); // lire un nombre entier


        int resultat = plusgrand(nombre1,nombre2); // appel de la méthode

        System.out.println("Le plus grand nombre est : " + resultat);
        clavier.close();
        
    } 

  // Méthode qui calcule la circonférence
    public static int plusgrand(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

} 


