package pl.javastart.task;

public class NaCzarno extends FormaOpodatkowania {
    private final static String NAZWA = "Na czarno";

    @Override
    public double wyliczPodatek(double przychody) {
        return 0;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
