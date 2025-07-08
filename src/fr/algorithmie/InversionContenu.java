package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] arrayCopy = new int[array.length];
        //copie inversée
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[array.length - 1 -i];
        }
        // Affichage des 2 tableaux en simultané
        for (int i = 0; i < array.length; i++) {
        System.out.println("arrayCopy inversé : " + arrayCopy[i] + " | array : " + array[i]);
        }
    }
}
