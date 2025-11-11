import java.util.Scanner;


public class j2probl1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectureClavier = new Scanner(System.in);

		String mot = null;
		String phrase = null;
		String reponse = null;
		int longueur;
		int ctr = 0;
		
		System.out.println("Probleme #1:");
		System.out.println("------------");
		System.out.println("Lecture d'une phrase : ");
		phrase = lectureClavier.nextLine();

		reponse = phrase.toUpperCase();
		System.out.println("Chaine phrase: " + phrase);
		System.out.println("Chaine en majuscule: " + reponse);

	
		System.out.println();
		System.out.println("Probleme #2:");
		System.out.println("------------");
		System.out.println("Lecture d'une phrase : ");
		phrase = lectureClavier.nextLine();

		longueur = phrase.length();
		System.out.println("Chaine phrase: " + phrase);
		System.out.println("Longueur chaine: " + longueur);

		
		System.out.println();
		System.out.println("Probleme #3:");
		System.out.println("------------");
		System.out.println("Lecture d'une phrase : ");
		phrase = lectureClavier.nextLine();

		reponse = phrase.toUpperCase();
		System.out.println("Chaine phrase: " + phrase);
		
		for (int i = 0; i < phrase.length(); i++)
		{
			if (phrase.charAt(i) == 'a')
			{
				ctr++;
			}
		}
		
		System.out.println("Nombre de a: " + ctr);

		reponse = phrase.replace("a", "$");
		System.out.println("Phrase après: " + reponse);

	}

}
