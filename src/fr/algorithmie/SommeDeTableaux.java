package fr.algorithmie;
//Prends aussi en compte le cas SommeDeTableauxDiff
public class SommeDeTableaux {
    public static void main(String[] args) {
       int[] t1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4, 8, 18} ;
       int[] t2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
    //Créer un tableau qui contient la somme des 2 tableaux précédents
        //Sélection de la longueur du tableau somme
        int maxLength;
        if (t1.length > t2.length){//alternative int maxLength = Math.max(t1.length, t2.length);
            maxLength = t1.length;
        }else{
            maxLength = t2.length;
        }
        int[] tsum = new int[maxLength];
        System.out.println("longueur max : "+ maxLength);

        for (int i = 0; i < maxLength ; i++) {
            int val1 = i < t1.length ? t1[i] : 0;
            int val2 = i < t2.length ? t2[i] : 0;
            tsum[i] = val1 + val2;
            System.out.println("index : "+ i + " | tsum : "+ tsum[i]);
        }

    }
}
