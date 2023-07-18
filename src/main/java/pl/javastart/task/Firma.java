package pl.javastart.task;

public class Firma {
    private static final int MAX_LICZBA_PRZYCHODOW = 1000;
    private static final int MAX_LICZBA_WYDATKOW = 1000;
    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;
    private Przychod[] przychody = new Przychod[MAX_LICZBA_PRZYCHODOW];
    private Wydatek[] wydatki = new Wydatek[MAX_LICZBA_WYDATKOW];
    private int obecnaLiczbaPrzychodow = 0;
    private int obecnaLiczbaWydatkow = 0;

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();
        double sumaWydatkow = zsumujWydatki();
        double podatekDoZaplacenia = getPodatekDoZaplacenia(sumaPrzychodow, sumaWydatkow);

        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", formaOpodatkowania.getNazwa());
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", sumaWydatkow);
        System.out.printf("Podatek do zapłacenia: %.2f zł", podatekDoZaplacenia);
        System.out.print("\n\n");
    }

    private double getPodatekDoZaplacenia(double sumaPrzychodow, double sumaWydatkow) {
        if (formaOpodatkowania.getNazwa().equals(RyczaltEwidencjonowany.NAZWA)) {
            return formaOpodatkowania.wyliczPodatek(sumaPrzychodow, 0);
        }
        return formaOpodatkowania.wyliczPodatek(sumaPrzychodow, sumaWydatkow);
    }

    private double zsumujWydatki() {
        double suma = 0;
        for (int i = 0; i < obecnaLiczbaWydatkow; i++) {
            suma += wydatki[i].getWartosc();
        }
        return suma;
    }

    private double zsumujPrzychody() {
        double suma = 0;
        for (int i = 0; i < obecnaLiczbaPrzychodow; i++) {
            suma += przychody[i].getWartosc();
        }
        return suma;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        Przychod przychod = new Przychod(nazwa, wartosc);
        przychody[obecnaLiczbaPrzychodow++] = przychod;
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        Wydatek wydatek = new Wydatek(nazwa, wartosc);
        wydatki[obecnaLiczbaWydatkow++] = wydatek;
    }
}
