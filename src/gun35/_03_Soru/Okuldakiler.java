package gun35._03_Soru;

public class Okuldakiler {
    private String ad;
    private String soyad;
    private String gorevi;



    public Okuldakiler(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    public static void KimlikFormuBelgesi(Okuldakiler okul) {

        if (okul instanceof Ogrenci) {
            System.out.println("Kimlik Belgesi Formu:" +
                    "Ad:" + okul.getAd() +
                    ", Soyad:" + okul.getSoyad() +
                    ", Görevi:" + okul.getGorevi() + ",Şubesi:" + ((Ogrenci) okul).getSubesi());

        }
        if (okul instanceof Calisan) {
            System.out.println("Kimlik Belgesi Formu:" +
                    "Ad:" + okul.getAd() +
                    ", Soyad:" + okul.getSoyad() +
                    ", Görevi:" + okul.getGorevi() + ",Departmanı:" + ((Calisan) okul).getDepartmani());
        }

    }

}
