package gun32.Ornek;

public class Ogrenci {
    private int ID;
    private String ad;
    private String soyad;
    private int yas;
    static int idSayac=1;


    public Ogrenci(String ad, String soyad, int yas) {
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
        setID(idSayac++);


    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {

    }

    public static int getIdSayac() {
        return idSayac;
    }

    public static void setIdSayac(int idSayac) {
        Ogrenci.idSayac = idSayac;
    }

    @Override
    public String toString() {
        return "Ogrenci  {" +
                "ad='" + ad + " " +
                ", soyad='" + soyad + " " +
                ", yas=" + yas +
                ", id=" + ID
        +
                '}';
    }
}
