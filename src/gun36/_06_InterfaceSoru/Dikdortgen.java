package gun36._06_InterfaceSoru;

public class Dikdortgen implements IHesaplamaYap {

    @Override
    public double cevresi(double a, double b) {

        return 2 * (a + b);
    }
    @Override
    public double alani(double a, double b) {
        return (a * b);
    }



    }



