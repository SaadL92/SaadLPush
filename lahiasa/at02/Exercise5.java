package lahiasa.at02;

public class Exercise5{

    public static void main(String[] args)
    {

       for (char lettre = 'a'; lettre <= 'z'; lettre++) 
       {   
            System.out.print(lettre);
        }
        System.out.println();

        // Alphabet à l'envers
        for (char lettredescroi = 'z'; lettredescroi >= 'a'; lettredescroi--) {
            System.out.print(lettredescroi);
        }
}   }
