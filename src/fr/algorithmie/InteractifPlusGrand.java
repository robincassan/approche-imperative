package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
//        Ecrire un programme qui demande 10 nombres à un utilisateur et qui affiche le plus grand de
//        ces nombres
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            System.out.println("Entrez le nombre "+ i + " : ");
            int nb = scanner.nextInt();
            if (nb > max){
                max = nb;
            }
        }
        System.out.println("Nombre le plus grand : "+max);
        scanner.close();
    }
}
