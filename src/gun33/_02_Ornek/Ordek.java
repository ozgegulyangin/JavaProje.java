package gun33._02_Ornek;

public class Ordek extends Hayvan{

    @Override
    public void konustur() {
        System.out.println("Vakladı");
    }

    private double kanatAcikligi;

    public Ordek(String renk, double kilo, String cinsi, double kanatAcikligi) {
        super(renk, kilo, cinsi);
        setKanatAcikligi(kanatAcikligi);

    }


    public double getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(double kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }

    public String toString() {
        return "Ördek{" + "renk='" + super.getRenk()+ '\'' +
                ", kilo=" + super.getKilo() +
                ", cinsi='" + super.getCinsi() + '\''+
                "kanat açıklığı=" + kanatAcikligi +
                '}';
    }
}
