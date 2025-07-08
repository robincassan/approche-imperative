package fr.algorithmie;
import java.util.Scanner;
public class InteractifChiffresSuivant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un entier : ");
        int nb = scanner.nextInt();
        for (int i = nb+1; i <= nb+10; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}
