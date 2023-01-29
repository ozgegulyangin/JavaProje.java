package gun33._02_Ornek;

public class Yilan extends Hayvan {

    @Override
    public void konustur() {
        System.out.println("Tııssladı.");
    }

    private double uzunluk;

    public Yilan(String renk, double kilo, String cinsi, double uzunluk) {
        super(renk, kilo, cinsi);
        setUzunluk(uzunluk);
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    @Override
    public String toString() {
        return "Yilan{" + "renk='" + super.getRenk()+ '\'' +
                ", kilo=" + super.getKilo() +
                ", cinsi='" + super.getCinsi() + '\''+
                "uzunluk=" + uzunluk +
                '}';
    }
}

