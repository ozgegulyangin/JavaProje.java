package gun39._01_OOP_Soru;

public class Kartal extends Hayvan{
    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println(getIsim()+" Et yer");

    }

    @Override
    void yemekMiktari() {
        System.out.println(getIsim()+" Günde 19 kilo yemek yer");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println(getIsim()+" Günde 6 saat uyur");

    }

    @Override
    void sesi() {
        System.out.println(getIsim()+" Ciyaklar");

    }
}
