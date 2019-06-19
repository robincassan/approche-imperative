import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement
//		compris entre 1 et 10 :
//		- Si le nombre est supérieur à 10, le programme affiche « Ce nombre est trop grand,
//		veuillez recommencer », puis redemande un nombre à l’utilisateur.
//		- Si le nombre est inférieur à 1, le programme affiche « Ce nombre est trop petit,
//		veuillez recommencer », puis redemande un nombre à l’utilisateur.
//		- Si le nombre est compris entre 1 et 10, le programme affiche ce nombre et se termine.
		Scanner scan = new Scanner(System.in);
		float nbchoosen;

		do {
			System.out.println("Veuillez choisir un nombre entre 1 et 10 : ");
			nbchoosen = scan.nextInt();
			if (nbchoosen > 10) {
				System.out.println("Ce nombre est trop grand veuillez recommencer");

			} else if (nbchoosen < 1) {
				System.out.println("Ce nombre est trop petit veuillez recommencer");

			} else {
				System.out.println("vous avez choisi : " + nbchoosen);

			}

		} while (nbchoosen > 10 || nbchoosen < 1);
		scan.close();

	}

}
