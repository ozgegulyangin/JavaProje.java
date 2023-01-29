package gun34._03_Ornek;

public class IlkOgrencisi extends Ogrenci {
    
    private String klup;
    private static int ilkIdSayac=100;

    public IlkOgrencisi(String ad,String klup, ogrTip tip) {
        super(ad, tip,ilkIdSayac++);
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
