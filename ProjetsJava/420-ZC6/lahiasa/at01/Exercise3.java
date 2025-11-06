package lahiasa.at01;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
      
        System.out.print("Entrez l'age de la Premiere Personne:");
		 int Age1 = clavier.nextInt();

        System.out.print("Entrez l'age de la Deuxieme Personne:");
		int Age2 = clavier.nextInt();

        int Moyenne;
        Moyenne=(Age1+Age2)/2;

        System.out.println("La moyenne d'age:"+Moyenne);

        if (Age1>Age2) {
            System.out.println("La personne la plus veille à :" + Age1);
        }
        else{
             System.out.println("La personne la plus veille à :" + Age2);
        }

          clavier.close();
    }
}