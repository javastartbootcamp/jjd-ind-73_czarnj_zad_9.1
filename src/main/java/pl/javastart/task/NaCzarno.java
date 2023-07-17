package pl.javastart.task;

public class NaCzarno extends FormaOpodatkowania {
    private static final String NAZWA = "Na czarno";

    @Override
    public double wyliczPodatek(double przychody) {
        return 0;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
