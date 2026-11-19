package symulator;

public class Samochod {
    private final Silnik silnik;
    private final SkrzyniaBiegow skrzynia;

    public Samochod(Silnik silnik, SkrzyniaBiegow skrzynia) {
        this.silnik = silnik;
        this.skrzynia = skrzynia;
    }

    public void wlacz() {
        silnik.uruchom();
    }

    public void wylacz() {
        silnik.zatrzymaj();
        skrzynia.ustawLuz();
    }
}