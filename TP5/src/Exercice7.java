import java.util.Scanner;

public class Exercice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ecrire un programme qui demande un nombre à l’utilisateur puis calcule la somme de tous les
//		entiers compris entre 1 et ce nombre.
//		Exemple si l’utilisateur saisit 5, le programme affiche: 15
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int nbchoice;
		
		System.out.println("Saisissez un entier : ");
		nbchoice = scanner.nextInt();
		for (int i = nbchoice; i > 0 ; i--) {
			sum += i;
			
		}
		System.out.println("La somme de tous les entiers entre "+nbchoice+" et 1 est : "+sum);
		scanner.close();
	}

}
