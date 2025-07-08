package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] tab = {0,1,2,3};
    // Effectuez une rotation à droite des éléments.
    // Exemple : si vous avez {0,1,2,3} vous obtenez {3,0,1,2}
        if (tab.length > 1) {
            int dernier = tab[tab.length - 1]; //sauvegarde du dernier élément

            //décalage à droite des éléments
            for (int i = tab.length - 1; i > 0; i--) {
                tab[i] = tab[i - 1];
            }
            tab[0] = dernier; // remise du dernier en première position
        }
        //affichage du tableau après rotation
        for (int val : tab){
            System.out.println(val);
        }
    }
}
