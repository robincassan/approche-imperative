package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5,6};
        boolean bool = tab.length > 0 && (tab[0]==6 || tab[tab.length-1] == 6);//on affecte à la variable
        //booléenne bool le resultat de longueur du tableau strictement positive et premier ou dernier élément
        //du tableau est égal à 6
        System.out.println(bool); // affiche la valeur de la variable booléenne
    }
}
