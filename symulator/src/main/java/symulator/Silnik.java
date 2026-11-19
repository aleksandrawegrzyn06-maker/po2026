package symulator;

public class Silnik extends Komponent {
    private final int maxObroty;
    private int obroty;

    public Silnik(String nazwa, double waga, double cena, int maxObroty) {
        super(nazwa, waga, cena);
        this.maxObroty = maxObroty;
    }

    public void uruchom() {
        obroty = Math.min(800, maxObroty);
    }

    public void zatrzymaj() {
        obroty = 0;
    }

    public int getObroty() {
        return obroty;
    }
}