
public class Exercice1 {

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// question 1

//	for (int i : array) {
//			System.out.println(i);
//}

		// question 2

//	for (int i = array.length -1; i >= 0; i--) {
//		System.out.println(array[i]);
//	}

		// question 3
//
//		for (int i : array) {
//
//			if (i > 3) {
//				System.out.println(i);
//			}

			// question 4

//		for (int i = array.length -1; i >= 0; i--) {
//			if (array[i]%2 == 0) {
//				System.out.println(array[i]);
//			}
//			
//		}
		
		// question 5
		
//		for (int i = 0; i < array.length; i++) {
//			if (i%2 == 0) {
//				System.out.println(array[i]);
//			}
//			
//		}
		
		// question 6
		
//		for (int i = 0; i < array.length; i++) {
//			if (array[i]%2 != 0) {
//				System.out.println(array[i]);
//			}
//			
//		}
		
//		// question 7
//		int max = array[0];
//		for (int i = 0; i < array.length; i++) {
//			
//			if (array[i] > max) {
//				max = array[i];
//			}
//			}
		
			
		// question 8
				int min = array[0];
				for (int i = 0; i < array.length; i++) {
					
					if (array[i] < min) {
						min = array[i];
					}
					}
				System.out.println(min);
		}
		
		
		
	}


