package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;

public class lotto {

    private static final Random random = new Random();

    // Zadanie 1: losowanie 6 różnych liczb z zakresu 1–49
    public static ArrayList<Integer> losujLiczby() {
        ArrayList<Integer> liczby = new ArrayList<>(6);

        while (liczby.size() < 6) {
            int liczba = random.nextInt(49) + 1;

            if (!liczby.contains(liczba)) {
                liczby.add(liczba);
            }
        }

        return liczby;
    }

    // Zadanie 2: sprawdzanie liczby trafień
    public static int policzTrafienia(ArrayList<Integer> typy,
                                      ArrayList<Integer> wylosowane) {
        int trafienia = 0;

        for (int liczba : typy) {
            if (wylosowane.contains(liczba)) {
                trafienia++;
            }
        }

        return trafienia;
    }

    public static void main(String[] args) {

        // Bez argumentów wykonujemy tylko zadanie 1
        if (args.length == 0) {
            System.out.println(losujLiczby());
            return;
        }

        // Dopisanie "symulacja" uruchamia zadanie 3
        boolean symulacja = args.length == 7
                && args[6].equals("symulacja");

        if (args.length != 6 && !symulacja) {
            System.out.println("Podaj 6 liczb, np.: 1 2 3 5 8 9");
            System.out.println("Dla zadania 3 dopisz na końcu: symulacja");
            return;
        }

        ArrayList<Integer> typy = new ArrayList<>(6);

        // Odczytujemy i sprawdzamy liczby podane przez użytkownika
        for (int i = 0; i < 6; i++) {
            int liczba;

            try {
                liczba = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println(
                        "Podawaj tylko liczby całkowite z zakresu 1-49."
                );
                return;
            }

            if (liczba < 1 || liczba > 49) {
                System.out.println(
                        "Każda liczba musi być z zakresu 1-49."
                );
                return;
            }

            if (typy.contains(liczba)) {
                System.out.println(
                        "Podane liczby nie mogą się powtarzać."
                );
                return;
            }

            typy.add(liczba);
        }

        System.out.println("Twoje typy: " + typy);

        if (symulacja) {
            System.out.println("Trwa symulacja trafienia 6/6...");
        }

        long start = System.currentTimeMillis();

        // Pierwsze losowanie
        ArrayList<Integer> wylosowane = losujLiczby();
        int trafienia = policzTrafienia(typy, wylosowane);
        long liczbaLosowan = 1;

        // Zadanie 3: losujemy dalej, aż trafimy wszystkie 6 liczb
        while (symulacja && trafienia < 6) {
            wylosowane = losujLiczby();
            trafienia = policzTrafienia(typy, wylosowane);
            liczbaLosowan++;
        }

        long czas = System.currentTimeMillis() - start;

        System.out.println("Wylosowane liczby: " + wylosowane);
        System.out.println("Liczba trafień: " + trafienia);

        if (symulacja) {
            System.out.println("Liczba losowań: " + liczbaLosowan);
            System.out.println("Czas symulacji: " + czas + " ms");
            System.out.println(
                    "Czas w sekundach: " + czas / 1000.0 + " s"
            );
        }
    }
}