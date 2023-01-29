package gun37._02_Soru;

public class Duck implements Flying,Sailing{
    @Override
    public String food() {
        return "Ördek balık yer";
    }

    @Override
    public String ucar() {
        return "Ördekler uçabilirler";
    }

    @Override
    public String yuzer() {
        return "Ördekler iyi birer yüzücüdürler";
    }
}
