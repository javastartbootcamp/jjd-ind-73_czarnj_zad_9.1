package pl.javastart.task;

public class Przychod {
    private String nazwa;
    private double wartosc;

    public Przychod(String nazwa, double wartosc) {
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
