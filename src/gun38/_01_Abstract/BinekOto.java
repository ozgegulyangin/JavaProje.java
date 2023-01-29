package gun38._01_Abstract;

// ikisi bir arada -> 1 interface +ParentClass olacaksa
// = abstract class kullanılır
// 1er tane olduğunda kullanılabiliyor

public abstract class BinekOto {
    private String marka;
    private int uretimYili;
    private int vitesAdedi;

    abstract int HizlanmaSuresi();

    public BinekOto(String marka, int uretimYili, int vitesAdedi) {
        setMarka(marka);
        setUretimYili(uretimYili);
        setVitesAdedi(vitesAdedi);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdedi() {
        return vitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }
}
