package gun04;

public class _03_WideningCasting {
    public static void main(String[] args) {
        // byte-> short -> int -> long -> float -> double

        int sayi=9;
        long toplam=6700;
        double oran=3.2;

        oran = sayi; // oran=9 , veri kaybı yok. int'i double'a attık.
        System.out.println("oran = " + oran);

        toplam=sayi; // kayip yok , toplam=9 olur. int'i long'a attık.
        System.out.println("toplam = " + toplam);
        oran=toplam; // kayıp yok, oran=9 long'u double'a attık.
        System.out.println("oran = " + oran);

    }
}
