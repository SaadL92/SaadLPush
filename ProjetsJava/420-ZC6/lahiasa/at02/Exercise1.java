
package lahiasa.at02;
import java.util.Scanner;

public class Exercise1{

    public static void main(String[] args)
    {
        Scanner clavier = new Scanner(System.in);

        //Entrez une phrase 
       	System.out.print("Entrez une phrase ou un mot : ");
		String texte = clavier.nextLine();

        
        // Conversion en majuscules
        String texteMaj = texte.toUpperCase();
        System.out.println("En majuscules : " + texteMaj);

		
         clavier.close();
    }
}
