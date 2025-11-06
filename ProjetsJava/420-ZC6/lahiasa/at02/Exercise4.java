package lahiasa.at02;

import java.util.Scanner;

public class Exercise4 {

  public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);
    int chiffre;
    do {
      System.out.print("Veuillez saisir une valeur comprise entre 0 et 100 : ");
      chiffre = clavier.nextInt();
    } while (chiffre < 0 || chiffre > 100);
    {
      System.out.print("Nombre Corrcet!\n");
    }

    System.out.println("La valeur saisie est : " + chiffre);
    clavier.close();
  }
}
