package pl.javastart.task;

public class PodatekLiniowy extends FormaOpodatkowania {
    public static final String NAZWA = "Podatek liniowy";
    private static final double SKALA_PODATKU_LINIOWEGO = 0.19;

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        return SKALA_PODATKU_LINIOWEGO * (przychody - wydatki);
    }

    @Override
    public String getNazwa() {
        return NAZWA;
    }
}
