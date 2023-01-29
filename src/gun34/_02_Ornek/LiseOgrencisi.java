package gun34._02_Ornek;

public class LiseOgrencisi extends Ogrenci{

   private String brans;

    public LiseOgrencisi(String ad,String brans, ogrTip tip) {
        super(ad, tip);
        setBrans(brans);
    }


    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return super.toString()+",Branşı:"+getBrans()+" )";
    }
}
