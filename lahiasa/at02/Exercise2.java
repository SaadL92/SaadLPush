
package lahiasa.at02;
import java.util.Scanner;

public class Exercise2{

    public static void main(String[] args)
    {
        Scanner clavier = new Scanner(System.in);

        //Entrez une phrase 
       	System.out.print("Entrez une phrase ou un mot : ");
		String texte = clavier.nextLine();

        
        int longeur = texte.length();
        System.out.println("Nombre de caractere : " + longeur);

         clavier.close();
    }
}
