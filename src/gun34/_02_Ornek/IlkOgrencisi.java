package gun34._02_Ornek;

public class IlkOgrencisi extends Ogrenci {
    
    private String klup;

    public IlkOgrencisi(String ad,String klup, ogrTip tip) {
        super(ad, tip);
        setKlup(klup);
    }


    public String getKlup() {
        return klup;
    }

    public void setKlup(String brans) {
        this.klup = brans;
    }

    @Override
    public String toString() {
        return super.toString()+",Klubü:"+getKlup()+")";
    }
}
