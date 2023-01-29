package gun34._03_Ornek;

public class LiseOgrencisi extends Ogrenci {

   private String brans;
   private static int LiseIdSayac=200;

    public LiseOgrencisi(String ad,String brans, ogrTip tip) {
        super(ad, tip,LiseIdSayac++);
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
