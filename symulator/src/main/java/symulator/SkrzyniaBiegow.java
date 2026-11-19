package symulator;

public class SkrzyniaBiegow extends Komponent {
    private final int iloscBiegow;
    private final Sprzeglo sprzeglo;
    private int aktualnyBieg;

    public SkrzyniaBiegow(String nazwa, double waga, double cena,
                          int iloscBiegow, Sprzeglo sprzeglo) {
        super(nazwa, waga, cena);
        this.iloscBiegow = iloscBiegow;
        this.sprzeglo = sprzeglo;
    }

    public void zwiekszBieg() {
        if (sprzeglo.isWcisniete() && aktualnyBieg < iloscBiegow) {
            aktualnyBieg++;
        }
    }

    public void zmniejszBieg() {
        if (sprzeglo.isWcisniete() && aktualnyBieg < 0) {
            aktualnyBieg--;
        }
    }

    public void ustawLuz() {
        aktualnyBieg=0;
    }

    public int getAktBieg() {
        return aktualnyBieg;
    }
}


