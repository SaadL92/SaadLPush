package lahiasa.at01;


public class Exercise7 {
    public static void main(String[] args) {

     
 // --- Partie 1 ---
        int A = 3 * 10 + 45 / 5 - 8 + 56 % 20;
        System.out.println("Résultat A = " + A);

        int B = 3 * 10 + 45 / (5 - 8 + 56) % 20;
        System.out.println("Résultat B = " + B);

        int C = 3 * 10 + 45 / (5 - 8) % 56 % 20;
        System.out.println("Résultat C = " + C);

        int D = 3 * 10 + 45 / (5 - 8) + 56 % 20;
        System.out.println("Résultat D = " + D);

        int E = 3 * (10 + 45) / 5 - 8 + 56 % 20;
        System.out.println("Résultat E = " + E);

        int F = 3 * (10 + 45 / 5) - 8 + 56 % 20;
        System.out.println("Résultat F = " + F);


          System.out.println("--------------------------");

// --- Partie 2 ---

        double A2 = 12 + 3 * 4 / 3;
        System.out.println("Résultat 2A = " + A2);

        double B2 = 3.7 + (8 / 2) * (8 / 2);
        System.out.println("Résultat 2B = " + B2);

        double C2 = 13 + 4 * 2 - 3 * (8 % 3 + 5);
        System.out.println("Résultat 2C = " + C2);

        double D2 = 6 / 2 / 3;
        System.out.println("Résultat 2D = " + D2);

        double E2 = (-5 * 2) * (5 * 2) * 10 + 18 / (4 + 8 / 2 / 2);
        System.out.println("Résultat 2E = " + E2);

        double F2 = 24 + 36 / (6 * 3 / (7 + 2 ));
        System.out.println("Résultat 2F = " + F2);

        double G2 = 8 + 4 / 2 + 6;
        System.out.println("Résultat 2G = " + G2);

        int H2 = (int)(7.67 + 0.5) - (int)7.67;
        System.out.println("Résultat 2H = " + H2);

        double I2 = (int)(-7.67 + 0.5) - (int)(-7.67);
        System.out.println("Résultat 2I = " + I2);

        double J2 = 3 + 5 * 6 / 3 - 5;
        System.out.println("Résultat 2J = " + J2);

        double K2 = 1.0 / (1.0 / 2);
        System.out.println("Résultat 2K = " + K2);

        double L2 = 1.0 / 1.0 / 2.0;
        System.out.println("Résultat 2L = " + L2);

        System.out.println("--------------------------");

// --- Partie 3 ---


        int a = 2;
        int b = 3;
        int c = 5;
        int d = 3;


        int A3 =  (a * (b + d) - 2) * 3;
        System.out.println("Résultat 3A = " + A3);


        double B3 = Math.sqrt(c - a) * d - 1;   
        System.out.println("Résultat b = " + B3);

        double C3 =  b * (-d + 2) - a * (c + d);
        System.out.println("Résultat C = " + C3);



    }
}
