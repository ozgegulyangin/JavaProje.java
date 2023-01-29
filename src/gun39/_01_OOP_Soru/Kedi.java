package gun39._01_OOP_Soru;

public class Kedi extends Hayvan{
    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);

    }

    @Override
    void yiyecegi() {
        System.out.println(getIsim()+" Yaş mama yer");

    }

    @Override
    void yemekMiktari() {
        System.out.println(getIsim()+" Günde 2 kase mama yer");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println(getIsim()+" Günde 12 saat uyur.");

    }

    @Override
    void sesi() {
        System.out.println(getIsim()+" Miyavlar");

    }
}
