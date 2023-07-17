package pl.javastart.task;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {
    private static final String NAZWA = "Ryczałt ewidencjonowany";

    @Override
    public double wyliczPodatek(double przychody) {
        return przychody * 0.15;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
