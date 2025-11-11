package lahiasa.at02;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        
        System.out.print("Insérer le rayon d'un cercle >>> ");
        System.out.printf("Rayon: %f", circonferencecercle(clavier.nextInt()));
        clavier.close();
    }

    // Méthode qui calcule la circonférence
    public static double circonferencecercle(int rayon) {
        return 2 * Math.PI * rayon;
    }//Return la circonference 

}
