package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int batons = 21;
        boolean  joueurCommence = random.nextBoolean();

        System.out.println("Vous jouez au jeu des batons, il y a 21 batons");
        System.out.println("Celui qui prend le dernier baton a perdu!");

        if (joueurCommence){
            System.out.println("Vous commencez !");
        }else {
            System.out.println("L'ordinateur commence");
        }

        boolean tourDuJoueur = joueurCommence;

        while (batons > 0) {
            System.out.println("\nBâtons restants : " + batons);
            afficherBatons(batons); //affichage des batons

            int prise;
            if (tourDuJoueur) {
                // Tour du joueur
                do {
                    System.out.print("Combien de bâtons prenez-vous ? (1 à 3) : ");
                    prise = scanner.nextInt();
                } while (prise < 1 || prise > 3 || prise > batons);
            } else {
                // Tour de l'ordinateur
                prise = Math.min(batons, random.nextInt(3) + 1);
                System.out.println("L'ordinateur prend " + prise + " bâton(s).");
            }

            batons -= prise;

            // Vérifie s'il ne reste plus de bâtons
            if (batons == 0) {
                System.out.println("\n Batons restants : 0");
                afficherBatons(0);
                if (tourDuJoueur) {
                    System.out.println("\nVous avez pris le dernier bâton. Vous avez perdu !");
                } else {
                    System.out.println("\nL'ordinateur a pris le dernier bâton. Vous avez gagné !");
                }
                break;
            }

            // On change de joueur
            tourDuJoueur = !tourDuJoueur;
        }
        scanner.close();
    }
    // Méthode pour afficher les bâtons graphiquement
    public static void afficherBatons(int nb) {
        for (int i = 0; i < nb; i++) {
            System.out.print("| ");
        }
        System.out.println(); // retour à la ligne
    }
}
