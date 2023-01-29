package gun34._02_Ornek;

public class Ogrenci {

    private final int id;
    private  String ad;
    static int idSayac=1;

    private ogrTip tip;


    public Ogrenci(String ad, ogrTip tip) {
        setAd(ad);
        this.id=idSayac++;
         setTip(tip);

    }

    public ogrTip getTip() {
        return tip;
    }

    public void setTip(ogrTip tip) {
        this.tip = tip;
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public static int getIdSayac() {
        return idSayac;
    }

    public static void setIdSayac(int idSayac) {
        Ogrenci.idSayac = idSayac;
    }

    @Override
    public String toString() {
        return "Öğrenci'nin (" +
                "ID'si:" + id +
                ",ADI:" + ad +", Kademesi:"+tip;
    }
}
