package pl.javastart.task;

public class NaCzarno extends FormaOpodatkowania {
    public static final String NAZWA = "Na czarno";

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        return 0;
    }

    @Override
    public String getNazwa() {
        return NAZWA;
    }
}
