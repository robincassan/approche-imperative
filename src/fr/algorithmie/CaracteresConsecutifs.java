package fr.algorithmie;

public class CaracteresConsecutifs {
    public static void main(String[] args) {
//        Soit une chaine de caractères quelconque, transformez cette chaîne en comptant les
//        répétitions successives (ex : "aaabbc" → "a3b2c1").
        String chaine = "aaaabbbccddd";
        String chaineModif ="";
        int count = 1;

        for (int i = 1; i < chaine.length(); i++) {
            if (chaine.charAt(i) == chaine.charAt(i - 1)) {
                count++;
            } else {
                chaineModif = chaineModif + chaine.charAt(i - 1) + count;
                count = 1;
            }
        }

        // Ajouter le dernier caractère + son nombre d’occurrences
        chaineModif = chaineModif + chaine.charAt(chaine.length() - 1) + count;

        System.out.println("Chaîne compressée : " + chaineModif);
    }

}
