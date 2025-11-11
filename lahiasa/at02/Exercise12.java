package lahiasa.at02;
import java.util.Scanner;
public class Exercise12 {
     public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        System.out.print("Entre un nombre Maximum : ");
        int max = clavier.nextInt(); // lire un nombre entier

        System.out.print("Entre un deuxieme Minimum : ");
        int min = clavier.nextInt(); // lire un nombre entier
    
        System.out.println("Somme de tout: " + sommeMinMax(min, max));
        clavier.close();
    }

    public static int sommeMinMax(int min, int max) {
        int somme = 0;
        for (int i = min; i <= max; i++) {
            somme += i;
        }
        return somme;
    }


}
