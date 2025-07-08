package fr.operateurs;

public class DeclarationOperateurs {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean testEt = a>0 && b<10;
        System.out.println(testEt);
        boolean testOu = a>0 || b<10;
        System.out.println(testOu);
    }
}
