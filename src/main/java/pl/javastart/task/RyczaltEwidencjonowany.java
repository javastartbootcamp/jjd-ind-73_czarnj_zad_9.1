package pl.javastart.task;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {
    public static final String NAZWA = "Ryczałt ewidencjonowany";
    private static final double SKALA_PODATKU_15 = 0.15;

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        if (wydatki != 0) {
            throw new IllegalArgumentException("Wydatki muszą wynosić 0");
        }
        return SKALA_PODATKU_15 * przychody;
    }

    @Override
    public String getNazwa() {
        return NAZWA;
    }
}
