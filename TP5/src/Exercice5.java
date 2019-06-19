import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ecrire un programme qui demande un nombre à l’utilisateur puis qui affiche les 10 nombres
//		suivants. Par exemple si l’utilisateur saisit 5, le programme affiche : 6, 7, 8, 9, 10, 11, 12, 13,
//		14, 15.

		Scanner scanner = new Scanner(System.in);
		int nbchoisi;

		System.out.println("veuillez entrez un nombre entier : ");
		nbchoisi = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(nbchoisi + i);

		}
		scanner.close();
	}
}
