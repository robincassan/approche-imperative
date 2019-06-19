
public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
	
		// Quelle est la moyenne des éléments du tableau?
		float average = 0f;
		int sum = 0;
		for (int i : array) {
			sum += i;		
		}
		average =   (float) sum / array.length;
		System.out.println("la moyenne du tableau est : " + average + "   " + sum);
	}

}
