package gun33._03_Ornek;

public class SirketMain {
    /*Calisan isminde bi class tanımlayınız properties/fields(isim, maas, maasKatSayisi(int))
    consructor ve maashesapla Metodu(maas*maasKatSayisi) ekleyiniz. toString metodu ekleyiniz.
    GenelMudur isimli bir classı Calisan sınıfından türetip, extra field olarak tazminat ekleyiniz.
    GenelMudur classında maasHesaplaya tazminat da ekleyiniz.
    SirketMain diye yazacağınız main in olduğu yerde, 1 calısan ve 1 GenelMüdür tanımlayarak,
    maaşları hesaplatıp, bordroyu yazdırınız.*/
    public static void main(String[] args) {

        Calisan c1=new Calisan("Ali",14000,2);

        System.out.println(c1);

        GenelMudur gm=new GenelMudur("Özge",20000,3,2000);

        System.out.println(gm);

    }
}
