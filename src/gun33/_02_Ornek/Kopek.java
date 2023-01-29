package gun33._02_Ornek;

public class Kopek extends Hayvan {


    public Kopek(String renk, double kilo, String cinsi) {
        super(renk, kilo, cinsi);

    }

    @Override
    public void konustur() {
        System.out.println("havladı");
    }
    @Override
    public String toString() {
        return "Köpek{" +
                "renk='" + super.getRenk()+ '\'' +
                ", kilo=" + super.getKilo() +
                ", cinsi='" + super.getCinsi()+ '}';
    }
}
