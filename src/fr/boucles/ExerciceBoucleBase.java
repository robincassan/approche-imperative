package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i <= 20; i++) {
            System.out.println("Robin Cassan");
        }
        for (int i = 0; i <= 100; i++) {
            if (i%2 == 0 && i!=0) {
            System.out.println(i);
            }
        }
        for (int i = 0; i <= 100; i++) {
            if (i%2!= 0) {
                System.out.println(i);
            }
        }

    }
}
