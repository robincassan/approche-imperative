package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        //Affichage des entiers supérieurs à 3
        for (int val : array){
            if (val >= 3){
                System.out.println(val + " ");
            }
        }
        System.out.println("======================================================================");
        //Affichage que des entiers pairs
        for (int val : array){
            if(val%2 == 0){
                System.out.println(val);
            }
        }
        System.out.println("======================================================================");
        //Affichage que des entiers impairs
        for (int val : array){
            if(val%2 != 0){
                System.out.println(val);
            }
        }
        System.out.println("======================================================================");
        //Affichage des valeurs correspondant au index pairs
        for (int i = 0; i < array.length; i++) {
            if (i%2 == 0) {
                System.out.println(array[i]);
            }            
        }
    }
}
