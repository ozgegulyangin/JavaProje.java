package gun38._02_Ornek_Sekiller;

public class Daire extends Sekil {

    private double r;


    public Daire(double r) {
        setR(r);
    }


    @Override
    double Alan() {
        return Math.PI * r * r;
    }

    @Override
    double Cevre() {
        return 2 * Math.PI * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
