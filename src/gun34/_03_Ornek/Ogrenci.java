package gun34._03_Ornek;

public class Ogrenci {

    private final int id;
    private  String ad;


    private ogrTip tip;


    public Ogrenci(String ad, ogrTip tip,int id) {
        setAd(ad);
        setTip(tip);
        this.id=id;

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


    @Override
    public String toString() {
        return "Öğrenci'nin (" +
                "ID'si:" + id +
                ",ADI:" + ad +", Kademesi:"+tip;
    }
}
