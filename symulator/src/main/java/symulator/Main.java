package symulator;

public class Main{
    public static void main(String[] args) {
        Silnik silnik = new Silnik("Silnik", 120.0, 2500.0, 6000);
        Sprzeglo sprzeglo = new Sprzeglo("Sprzeglo", 7.0, 600.0);
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow(
                "Skrzynia", 40.0, 1800.0, 5, sprzeglo);
        Samochod samochod = new Samochod(silnik, skrzynia);

        samochod.wlacz();
        sprzeglo.wcisnij();
        skrzynia.zwiekszBieg();
        sprzeglo.zwolnij();

        System.out.println(silnik.getObroty() + " obr./min, bieg " + skrzynia.getAktBieg());

        samochod.wylacz();
        System.out.println(silnik.getObroty() + " obr./min, bieg " + skrzynia.getAktBieg());

    }

}




