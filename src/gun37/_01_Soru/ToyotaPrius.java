package gun37._01_Soru;

public class ToyotaPrius extends Vehicle implements IElectric, IGas {

    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattrery() {
        return "10000 km'de bataryayı değiştirmelisin";

    }

    @Override
    public String changeOil() {
        return "2000 km'de bir yağı değiştirmelisin.";

    }

    @Override
    public String drive() {
        return "Yarı otomatik ve Manul sürücü";
    }

}
