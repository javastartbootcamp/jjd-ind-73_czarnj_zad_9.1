package pl.javastart.task;

public class Wydatek {
    private String nazwa;
    private double wartosc;

    public Wydatek(String nazwa, double wartosc) {
        this.nazwa = nazwa;
        this.wartosc = wartosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getWartosc() {
        return wartosc;
    }
}
