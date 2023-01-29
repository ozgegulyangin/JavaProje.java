package gun33._03_Ornek;

public class Calisan {
    private String isim;
    private int maas;
    private int maasKatsayisi;

    public Calisan(String isim, int maas, int maasKatsayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaasKatsayisi(maasKatsayisi);
    }
     public int maasHesapla(){
       return (maas*maasKatsayisi);
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getMaasKatsayisi() {
        return maasKatsayisi;
    }

    public void setMaasKatsayisi(int maasKatsayisi) {
        this.maasKatsayisi = maasKatsayisi;
    }

    @Override
    public String toString() {
        return "Calisanın Bordrosu: (" +
                "ismi:" + isim  +
                ", maaşı:" + maas +
                ", maasKatsayisi:" + maasKatsayisi +" ,Maaş hesapla:"+maasHesapla()+")";
    }
}
