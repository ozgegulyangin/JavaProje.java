package gun33._02_Ornek;

public class Kedi extends Hayvan{

    public Kedi(String renk, double kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustur() {
        System.out.println("Miyavladı");
    }
    @Override
    public String toString() {
        return "Köpek{" +
                "renk='" + super.getRenk()+ '\'' +
                ", kilo=" + super.getKilo() +
                ", cinsi='" + super.getCinsi()+ '}';
    }
}