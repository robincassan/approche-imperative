package fr.algorithmie;

public class NombreParfait {
    public static void main(String[] args) {
        int a = 6; //autres nombres parfaits 28 496
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        if (sum == a) {
            System.out.println(a + " est un nombre parfait");
        } else {
            System.out.println(a + " n'est pas un nombre parfait");
        }
    }
}
