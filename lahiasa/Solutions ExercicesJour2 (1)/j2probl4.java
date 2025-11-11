import java.util.Scanner;


public class j2probl4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre ; // nombre lu à l'écran 

		// permet de lire nos valeurs
		Scanner lectureClavier = new Scanner(System.in); 
		
        // lecture du nombre
        System.out.print("Entrez un nombre: ");
 
        // boucle qui permet d'afficher notre série de nombres
        do
        {
            nombre = lectureClavier.nextInt();
        }
 //       while ((nombre <0 || nombre >100));
        while (!(nombre >0 && nombre <100));
        
        System.out.print("Nombre: "+ nombre);

	}

}
