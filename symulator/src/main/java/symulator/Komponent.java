package symulator;

public class Komponent {
    private final String nazwa;
    private final double waga;
    private final double cena;

    public Komponent(String nazwa, double waga, double cena) {
        this.nazwa = nazwa;
        this.waga = waga;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getWaga() {
        return waga;
    }

    public double getCena() {
        return cena;
    }
}