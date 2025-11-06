package lahiasa.at02;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args)
    {
        Scanner clavier = new Scanner(System.in);
        int Icompteur = 0;

        //Entrez une phrase 
       	System.out.print("Entrez une phrase ou un mot : ");
		String texte = clavier.nextLine();

        //Résultat de la conversion en Majuscule
        String StexteMaj = texte.toUpperCase();
        System.out.println("En majuscules : " + StexteMaj);


        //Compteur de A
        for (int chiffre = 0; chiffre < texte.length(); chiffre++) {
        if (texte.charAt(chiffre) == 'a') {
            
            Icompteur++;
        }   
    }
        System.out.println("Nombre de A :"+ Icompteur);

        //Remplace les A par des $

        String texteModifie = texte.replace("a", "$");
        System.out.println("Voici le txte qunad on remplace les a -> $ :" + texteModifie);

    
     clavier.close();
        
    }

}
