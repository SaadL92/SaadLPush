import java.util.Scanner;


public class j2probl5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// permet de lire nos valeurs
		Scanner lectureClavier = new Scanner(System.in); 
 
        System.out.println("Alphabet ordre croissant:");
        for (char lettre = 'a'; lettre <= 'z'; lettre++)
        {
            System.out.print(lettre + " ");
        	
        }
	
        System.out.println("");
        System.out.println("Alphabet ordre decroissant:");
        for (char lettre = 'z'; lettre >= 'a'; lettre--)
        {
            System.out.print(lettre + " ");
        	
        }
		
  
	}

}
