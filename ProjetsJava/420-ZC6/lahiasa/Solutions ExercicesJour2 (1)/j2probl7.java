import java.util.Scanner;


public class j2probl7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String phrase = null;
		int ctr_voyelle = 0;
		int ctr_consonne = 0;
		
		Scanner lectureClavier = new Scanner(System.in);              
		System.out.println("Entrez une phrase: ");
		
		phrase = lectureClavier.nextLine().toLowerCase();
		
		for (int i = 0; i < phrase.length(); i++)
		{
			if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'e' || phrase.charAt(i) == 'i' ||
					phrase.charAt(i) == 'o' || phrase.charAt(i) == 'u' || phrase.charAt(i) == 'y')
				ctr_voyelle++;
			else if (phrase.charAt(i) == 'b' || phrase.charAt(i) == 'c' || phrase.charAt(i) == 'd' ||
					phrase.charAt(i) == 'f' || phrase.charAt(i) == 'g' || phrase.charAt(i) == 'h' ||
					phrase.charAt(i) == 'j' || phrase.charAt(i) == 'k' || phrase.charAt(i) == 'l' ||
					phrase.charAt(i) == 'm' || phrase.charAt(i) == 'n' || phrase.charAt(i) == 'p' ||
					phrase.charAt(i) == 'q' || phrase.charAt(i) == 'r' || phrase.charAt(i) == 's' ||
					phrase.charAt(i) == 't' || phrase.charAt(i) == 'v' || phrase.charAt(i) == 'w' ||
					phrase.charAt(i) == 'x' || phrase.charAt(i) == 'z' )
				ctr_consonne++;
			
		}
		
		System.out.println("Nombre de caractères: " +phrase.length() );
		System.out.println("Nombre de voyelles: " +ctr_voyelle );
		System.out.println("Nombre de consonnes: " +ctr_consonne );

	
	}

}
