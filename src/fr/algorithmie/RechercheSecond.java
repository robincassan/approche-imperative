package fr.algorithmie;

public class RechercheSecond {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
//Rechercher le second plus grand élément du tableau et affichez le
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int val : array){//premier balayage du tableau pour récupérer la valeur max1
            if ( val > max1){
                max1 = val;
            }
        }
        for (int val : array) {
            if (val > max2 && val < max1) {//second balayage du tableau pour récupérer la valeur max2
                max2 = val;
            }
        }
        System.out.println(max1 + " max2 : " + max2); //affichage max1 et max2
    }
}