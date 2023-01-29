package gun33._02_Ornek;

public class Hayvan {
    private String renk;
    private double kilo;
    private String cinsi;

    public Hayvan(String renk, double kilo, String cinsi) {
        setRenk(renk);
        setKilo(kilo);
        setCinsi(cinsi);
    }

    public void konustur(){
        System.out.println("ses");
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }


}
