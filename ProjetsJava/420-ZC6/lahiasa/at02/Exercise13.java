package lahiasa.at02;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
     

        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrer une température >>> ");
        double temperature = clavier.nextDouble();
        clavier.nextLine(); // problème avec juste un nextline qui fait apparaitre le header deux fois

         // Demander le type de conversion
        System.out.print("Voulez-vous convertir en (C)elsius ou en (F)ahrenheit ? ");
        String choix = clavier.nextLine();
    
        
        if (choix.equals("C") || choix.equals("c")) {
            double resultat = fahrenheitToCelsius(temperature);
            System.out.println("La temperature :"+temperature + "°F = " + resultat + "°C");
        } 
        else if (choix.equals("F") || choix.equals("f")) {
            double resultat = celsiusToFahrenheit(temperature);
            System.out.println("La temperature :"+temperature + "°C = " + resultat + "°F");
        } 
        else {
            System.out.println("Choix invalide. Veuillez entrer 'C' ou 'F'.");
        }
   
        
        clavier.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;}
}
