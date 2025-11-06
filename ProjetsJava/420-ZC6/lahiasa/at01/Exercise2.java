package lahiasa.at01;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        double somme;        
        double sommeDeuxsem; 

        System.out.print("Entrez votre Salaire ");
		double salaire = clavier.nextInt();

        System.out.print("Nombre d'heure ");
		double NbHeure = clavier.nextInt();

        somme = salaire *NbHeure;
        sommeDeuxsem = somme*2;

        System.out.println("Votre Salaire chaque quinzaine est de " + sommeDeuxsem);

        clavier.close();


    }
}
