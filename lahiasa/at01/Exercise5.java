package lahiasa.at01;
import java.util.Scanner;

public class Exercise5  {
    
    public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);
        
        double rabais ;
        double montantapresrabais;

        System.out.print("Entrez votre montant:");
		double montant = clavier.nextInt();
    
        rabais = montant * 25 /100;
        montantapresrabais= montant-rabais; 
        
         System.out.println("Montant apres rabais :" + montantapresrabais);

      clavier.close();
    }
}
