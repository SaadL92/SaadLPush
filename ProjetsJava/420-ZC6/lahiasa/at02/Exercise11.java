package lahiasa.at02;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {

        int nombre;
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrer un nombre entier >> "); 
        nombre = clavier.nextInt();

        System.out.println("La factorisation du nombre "+ nombre +" est : "+ factorielle(nombre));
        clavier.close();
        
    }

    public static int factorielle(int nombre) {
        int valeur = 1;
        for(int i = 1; i <= nombre; i++){
            valeur *= i;
        }
        return valeur;
    }

}
