import java.util.Scanner;

public class j2probl9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rayon;
		double resultat; 

		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Entrer le rayon: ");
		rayon = lectureClavier.nextDouble();

		resultat = circonference(rayon);

		System.out.print("La circonférence du cercle pour un rayon "+ rayon+ " est "+ resultat );

	}

	public static double circonference(double pRayon) {

		double resultat; 

		resultat = pRayon*2* Math.PI;
		return resultat;

	}

}


