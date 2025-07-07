package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] tableau = { 8, -7, 12, 1, -2, 14, 17, 9};
        System.out.println(tableau[0]);
        System.out.println(tableau.length);
        System.out.println(tableau[tableau.length -1]);
        System.out.println(tableau[10]); // erreur car il tente d'accéder
        // à un élément qui dépasse les dimensions du tableau
    }
}
