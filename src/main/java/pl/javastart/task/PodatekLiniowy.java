package pl.javastart.task;

public class PodatekLiniowy extends FormaOpodatkowania {
    private final static String NAZWA = "Podatek liniowy";
    @Override
    public double wyliczPodatek(double przychody) {
        return 0.19 * przychody;
    }

    @Override
    public String getName() {
        return NAZWA;
    }
}
