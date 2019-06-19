import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement
//		compris entre 1 et 10 :
//		- Tant que ce nombre n’est pas compris entre 1 et 10, le programme demande un
//		nouveau nombre à l’utilisateur.
//		- Si le nombre est compris entre 1 et 10, le programme affiche ce nombre et se termine.
		
		Scanner scanner = new Scanner(System.in);
		int nb; 
		do {
			System.out.println("Veuillez choisir un nombre compris entre 1 et 10");
			nb = scanner.nextInt();
		} while (nb >10 || nb < 1);
		scanner.close();
	}

}
