package gun32.Ornek;

import java.util.ArrayList;


public class Okul {
    private String okulAd="Atatürk Okulu";
    private int kontenjan;

     ArrayList<Ogrenci> ogrenciler = new ArrayList();

    public Okul(String okulAd, int kontenjan) {
        setOkulAd(okulAd);
        setKontenjan(kontenjan);
        setOgrenciler(ogrenciler);
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", kontenjan=" + kontenjan +
                ", ogrenciler=" + ogrenciler +
                '}';
    }
}
