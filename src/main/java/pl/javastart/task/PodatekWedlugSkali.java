package pl.javastart.task;

public class PodatekWedlugSkali extends FormaOpodatkowania {
    private static final double SKALA_WOLNA_OD_PODATKU = 0;
    private static final double SKALA_PODATKU_DO_100000 = 0.18;
    private static final double SKALA_PODATKU_PONAD_100000 = 0.32;
    private static final double MAX_PRZYCHOD_WOLNY_OD_PODATKU = 10_000;
    private static final double MAX_PRZYCHOD_PODATEK_18_PROCENT = 100_000;
    public static final String NAZWA = "Podatek według skali podatkowej";

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        double dochod = przychody - wydatki;
        if (dochod <= MAX_PRZYCHOD_WOLNY_OD_PODATKU) {
            return SKALA_WOLNA_OD_PODATKU;
        } else if (dochod <= MAX_PRZYCHOD_PODATEK_18_PROCENT) {
            return SKALA_PODATKU_DO_100000 * (dochod - MAX_PRZYCHOD_WOLNY_OD_PODATKU);
        } else {
            return SKALA_PODATKU_DO_100000 * (MAX_PRZYCHOD_PODATEK_18_PROCENT - MAX_PRZYCHOD_WOLNY_OD_PODATKU) +
                    SKALA_PODATKU_PONAD_100000 * (dochod - MAX_PRZYCHOD_PODATEK_18_PROCENT);
        }
    }

    @Override
    public String getNazwa() {
        return NAZWA;
    }
}
