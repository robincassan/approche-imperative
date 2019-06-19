
import java.util.Scanner;

public class Exercice10 {
	
////Faire un programme avec le menu suivant :
////1. Ajouter un nombre
////2. Afficher les nombres existants.
////Demander à l’utilisateur de choisir une option dans le menu.
////Si l’utilisateur sélectionne l’option 1, le programme demande un nombre à l’utilisateur puis
////l’ajoute à un tableau.
////Si l’utilisateur sélectionne l’option 2, le programme affiche le contenu du tableau.
////Si le tableau est plein, écrire un algorithme pour agrandir le tableau.
	// a refaire soit même et modifier le code pour que le tableau marche avec des entiers

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int nb = 0;
		int indexTableau = 0;
		int[] tab = new int[4];
		while(nb != 3) {
			do {
				System.out.println("1. Ajouter un nombre\n2.Afficher les nombres existants\n3.Sortie");
				nb = scanner.nextInt() ;
				if(nb > 3) {
					System.out.println("Ce nombre est trop grand, veuillez recommencer");
				} else if (nb < 1) {
					System.out.println("Ce nombre est trop petit, veuillez recommencer");
				}
			} while(nb < 1 || nb > 3);
			switch (nb) {
				case 1 :
					if (indexTableau >= tab.length) {
						int[] newTab = new int[tab.length + 4];
						for(int i = 0; i < tab.length; i++) {
							newTab[i] = tab[i];
						}
						tab = newTab;
					}
					System.out.println("entrez un nombre a ajouter au tableau :");
					tab[indexTableau] = scanner.nextInt();
					indexTableau ++;
					break;
				case 2 :
					System.out.println("contenu du tableau :");
					for(int i = 0; i < indexTableau; i++) {
						System.out.print(tab[i] + " ");
					}
					System.out.println("");
					break;
				default :
					break;
			}
		}	
		scanner.close();
		

	}

}