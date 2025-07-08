package fr.algorithmie;

import java.awt.desktop.OpenURIEvent;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nombres = new int[5]; // Taille initiale
        int compteur = 0; // Compte combien de nombres ont été ajoutés

        while (true) {
            System.out.println("\nMenu :");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();

            if (choix == 1) {
                System.out.print("Entrez un nombre : ");
                int nombre = scanner.nextInt();

                // Si le tableau est plein, on l’agrandit
                if (compteur == nombres.length) {
                    int[] nouveauTableau = new int[nombres.length * 2];
                    for (int i = 0; i < nombres.length; i++) {
                        nouveauTableau[i] = nombres[i];
                    }
                    nombres = nouveauTableau;
                    System.out.println("Tableau agrandi à " + nombres.length + " éléments.");
                }

                // Ajout du nombre
                nombres[compteur] = nombre;
                compteur++;
                System.out.println("Nombre ajouté avec succès !");

            } else if (choix == 2) {
                if (compteur == 0) {
                    System.out.println("Aucun nombre enregistré.");
                } else {
                    System.out.println("Nombres enregistrés :");
                    for (int i = 0; i < compteur; i++) {
                        System.out.print(nombres[i] + " ");
                    }
                    System.out.println(); // retour à la ligne
                }

            } else if (choix == 3) {
                System.out.println("Fin du programme.");
                break;

            } else {
                System.out.println("Choix invalide. Veuillez entrer 1, 2 ou 3.");
            }
        }
        scanner.close();
    }
}
