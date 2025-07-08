package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le rang N de la suite de Fibonacci : ");
        int n = scanner.nextInt();
        if (n < 0){
            System.out.println("Le rang doit être un entier positif.");
        }else {
            int resultat = TestFibonacci(n);
            System.out.println("Le nombre de rang "+ n +" est : " + resultat);
        }
        scanner.close();
    }
    //Méthode qui calcule le nombre de Fibonacci de rang N
    public static int TestFibonacci(int n){
        if (n == 0 ) return 0;
        if (n == 1 ) return 1;

        int precedent = 0;
        int actuel = 1;
        int suivant = 0;

        for (int i = 2; i <= n; i++) {
            suivant = precedent + actuel;
            precedent = actuel;
            actuel = suivant;
        }
        return actuel;
    }
}