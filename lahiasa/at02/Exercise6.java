package lahiasa.at02;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        int nombre;
        int max = 0, min = 0;
        int somme = 0;
        int compteur = 0;

        do {
            //Demander a l'utlisateur d'entrer des chiffres
            System.out.print("Entrer un nombre (0 pour arrêter) : ");
            nombre = clavier.nextInt();
            //Tant que le user n'ecris pas 0 alors 
            if (nombre != 0) {
                if (compteur == 0) { 
                    // Mise a jour du max et min
                    max = nombre;
                    min = nombre;
                }
                
                if (nombre > max) max = nombre;
                if (nombre < min) min = nombre;

                somme += nombre;
                compteur++;
            }

        } while (nombre != 0);

        double moyenne = (double) somme / compteur;

        


        System.out.println("\n----------Résultat------------");
        System.out.println("Plus grand = " + max);
        System.out.println("Plus petit = " + min);
        System.out.println("Moyenne = " + moyenne);
        
        clavier.close();
    }
}

















