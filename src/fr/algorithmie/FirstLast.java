package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] tab = {};
        boolean bool = tab.length >= 1 && tab[0] == tab[tab.length-1];// affectation du résultat
        //de longueur tableau supérieur ou égal à 1 et première valeur est égale à la dernière valeur
        //dans la variable bool
        System.out.println(bool);//affichage de la valeur bool
    }
}
