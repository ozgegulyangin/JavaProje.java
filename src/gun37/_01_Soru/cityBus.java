package gun37._01_Soru;

public class cityBus extends Vehicle implements IDiesel {
    public cityBus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {

        return "Yakıt değiştirmeyi unutma";
    }

    @Override
    public String drive() {
        return "Tamamen manuel sürücü";

    }
}
