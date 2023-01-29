package gun37._01_Soru;

public class TeslaCar extends Vehicle implements IElectric {

    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattrery() {
        return "10000 km'de bataryayı değiştirmelisin";

    }

    @Override
    public String drive() {
        return "Oto pilot ve manuel sürücü";

    }
}
