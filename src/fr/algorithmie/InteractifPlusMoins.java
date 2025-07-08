package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nbsaisie;
        int nbrandom = random.nextInt(100)+1;
        int count = 0;
        System.out.println("Trouvez le nombre aléatoire compris entre 1 et 100 : ");
        do {
        nbsaisie = scanner.nextInt();
        if (nbrandom > nbsaisie){
            System.out.println("Le nombre aléatoire est plus grand que " +nbsaisie);
        }
        if (nbrandom < nbsaisie){
            System.out.println("Le nombre aléatoire est plus petit que "+nbsaisie);
        }
        count++;
        }while (nbsaisie != nbrandom);
        System.out.println("Bravo vous avez trouvez en "+count+" coups");
    }
}
