package lahiasa.at01;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);
        

        System.out.print("Entrez la note de l'éleve :");
		int note = clavier.nextInt();
    
    
        if (note>=60) {
            System.out.println("Vous avez reussi l'examen de Math!");
        }
        else{
             System.out.println("Vous avez échouer l'examen de Math!");
        }

      clavier.close();
    }
}
