package gun03;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // yarıçapı verien bir dairenin cevresini ve alanını bulunuz
        // alan= pi*r*r  , cevre= 2*pi*r  , pi=3.14
        // double'da 4 kullanabiliriz çünkü 4.0 gibi düşün!

        double r=4;
        double pi=3.14;
        double cevre= 2*pi*r;
        double alan= pi*r*r;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);

    }
}
