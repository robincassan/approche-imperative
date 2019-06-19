import java.util.Scanner;

public class Exercice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		La suite de Fibonacci est une suite qui commence par 0 et 1 et dans laquelle le nombre de
//		rang N est égal à la somme des nombres de rangs N-1 et N-2
//		• Créer une classe TestFibonacci
//		• Demander à l’utilisateur de choisir un rang N
//		• Ecrire un algorithme qui calcule et affiche le nombre de rang N

		Scanner scan = new Scanner(System.in);
		int choix;
		int rangN = 0;
		int valA = 0, valB = 1;

		System.out.println("choisir un rang N :");
		choix = scan.nextInt();
		if (choix == 0) {
			System.out.println("Le nombre de rang 0 est : 0 ");
		} else if (choix == 1) {
			System.out.println("Le nombre de rang 1 est : 1 ");
		} else {
			for (int i = 1; i < choix; i++) {
				rangN = valA + valB;
				valA = valB;
				valB = rangN;
			}
			System.out.println("Le nombre de rang " + choix + " est : " + rangN);
			scan.close();

		}

	}

}
