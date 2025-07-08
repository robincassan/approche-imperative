package fr.tableaux;
import java.util.Arrays;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] tabVille = { "Paris", "Bordeaux", "Toulouse", "Montpellier","Lille"};
        System.out.println(Arrays.toString(tabVille));
        System.out.println(tabVille.length);
        tabVille[3]="Reims";
        System.out.println(Arrays.toString(tabVille));
    }
}
