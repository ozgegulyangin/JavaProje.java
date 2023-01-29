package gun38._02_Ornek_Sekiller;

public class Dikdortgen extends Sekil{

    private double a;
    private double b;

    public Dikdortgen(double a, double b) {
       setA(a);
       setB(b);
    }

    @Override
    double Alan() {
        return a*b;
    }

    @Override
    double Cevre() {
        return 2*(a+b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


}

