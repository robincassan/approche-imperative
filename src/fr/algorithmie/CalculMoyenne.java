package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        //Calculer la moyenne des éléments du tableau
        int sum = 0;
        for (int val : array){
            sum += val;
        }
        float moy =  (float) sum / array.length;
        System.out.println("Moyenne du tableau : " + moy);
    }
}
