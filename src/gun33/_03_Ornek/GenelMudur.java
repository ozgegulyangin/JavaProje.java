package gun33._03_Ornek;

public class GenelMudur extends Calisan{

    private int tazminat;

    public GenelMudur(String isim, int maas, int maasKatsayisi,int tazminat) {
        super(isim, maas, maasKatsayisi);
        setTazminat(tazminat);

    }

    @Override
    public int maasHesapla() {
       return super.maasHesapla()+getTazminat();
    }

    public int getTazminat() {
        return tazminat;
    }

    public void setTazminat(int tazminat) {
        this.tazminat = tazminat;

    }

    @Override
    public String toString() {
        return "Genel Müdürün Bordrosu:("+
                "ismi:" + super.getIsim()+
                ", maaşı:" + super.getMaas() +
                ", maasKatsayisi:" + super.getMaasKatsayisi() +", tazminat:"+tazminat+" ,Maaş Hesapla:"+maasHesapla()+")";
    }
}
