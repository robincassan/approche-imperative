import java.util.Scanner;

public class Exercice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Ecrire un programme qui demande 10 nombres à un utilisateur et qui affiche le plus grand de
//		ces nombres.

		Scanner scan = new Scanner(System.in);
		float[] array = new float[10];
		float max = array[0];

		System.out.println("veuillez saisir 10 nombres : ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("nombre " + (i+1) + " : ");
			array[i] = scan.nextFloat();
			if (array[i] > max) {
				max = array[i];				
			}
			
		}
		System.out.println("Le plus grand des nombres saisis est : "+max);
		scan.close();
	}

}
