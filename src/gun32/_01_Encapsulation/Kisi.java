package gun32._01_Encapsulation;

public class Kisi {
    private String ad; // 25 karakter olsun
    private String soyad; // 25 karakter olsun
    private int yas;

    void yasAta(int yas){
        if (yas>0)
            this.yas=yas;
        else
            System.out.println("Hatalı bir veri girdiniz.");
    }

    int yasVer(){
        return this.yas;
    }

    void setSoyad(String soyad){
        if(soyad.length()<25)
            this.soyad=soyad;
        else
            System.out.println("Hatalı Soyad");

    }
    String getSoyad(){
        return this.soyad;
    }

    void setAd(String ad){
        if(ad.length()<25)
            this.ad=ad;
        else
            System.out.println("Hatalı ad");

    }
    String getAd(){
        return this.ad;
    }

    @Override
    public String toString() {
        return "Kişi'nin {" +
                "adı:'" + ad  +
                ", soyadı:'" + soyad +
                ", yaş:" + yas +
                '}';
    }


}
