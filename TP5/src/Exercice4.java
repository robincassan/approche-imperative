import java.util.Scanner;


public class Exercice4 {

	public static void main(String[] args) {
//	Ecrire un programme qui demande un nombre à l’utilisateur qui doit être compris entre 1 et
//	10. Une fois que le nombre est bien entre 1 et 10, le programme affiche la table de
//	multiplication de ce nombre. Exemple :
//	Table de 3 :
//	3 * 1 = 3
//	3 * 2 = 6
//	...
//	3 * 10 = 30
	
	Scanner scanner = new Scanner(System.in);
	int nbchoisi;
	do {
	System.out.println("Choisissez un nombre entre 1 et 10");
	nbchoisi = scanner.nextInt();
	
	} while (nbchoisi <= 1 || nbchoisi >= 10);
	System.out.println("Le chiffre choisi est : " + nbchoisi);
	System.out.println("La table de " + nbchoisi +" :" );
	
	for (int i = 1; i <= 10; i++) {
		System.out.println( nbchoisi + " * " + i + " = " + nbchoisi * i);
	}
	scanner.close();
	
}
}
