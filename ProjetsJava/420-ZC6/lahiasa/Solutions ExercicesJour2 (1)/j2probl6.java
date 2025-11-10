import java.util.Scanner;


public class j2probl6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nombre ; // nombre lu à l'écran 
		int plusGrand, plusPetit;
		int total, ctr;
		double moyenne;

		ctr = 0;
		total = 0;

		// permet de lire nos valeurs
		Scanner lectureClavier = new Scanner(System.in); 

		// lecture du nombre
		System.out.print("Entrez un nombre: ");
		nombre = lectureClavier.nextInt();


		if (nombre != 0) {
			plusGrand = nombre;
			plusPetit = nombre;
			total = total + nombre;

			do
			{
				System.out.print("Entrez un nombre: ");
				nombre = lectureClavier.nextInt();
				ctr++;
				total = total + nombre;

				if (nombre > plusGrand) 
					plusGrand = nombre;
				else 
					plusPetit = nombre;

			}
			while (nombre != 0);

			moyenne = total / ctr;

			System.out.println("Total: "+ total);
			System.out.println("Nombre de chiffres (ctr): "+ ctr);
			System.out.println("Nombre plus grand: "+ plusGrand);
			System.out.println("Nombre plus petit: "+ plusPetit);
			System.out.println("Moyenne: "+ moyenne);
		}        

	}

}
