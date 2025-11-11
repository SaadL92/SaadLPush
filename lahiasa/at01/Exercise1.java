
package lahiasa.at01;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args)
    {
        Scanner clavier = new Scanner(System.in);

       	System.out.print("Entrez le premier nombre: ");
		int nombre1 = clavier.nextInt();
		System.out.print("Entrez le deuxième nombre: ");
		int nombre2 = clavier.nextInt();


        if (nombre1>nombre2) {
            System.out.println("Le plus grand nombre est : " + nombre1);
        }
        else if (nombre2 > nombre1) {
            System.out.println("Le plus grand nombre est : " + nombre2);
        } 
        else {
            System.out.println("Les deux nombres sont égaux !");
        }

         clavier.close();
    }
}















