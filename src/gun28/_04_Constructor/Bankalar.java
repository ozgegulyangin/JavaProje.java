package gun28._04_Constructor;

import gun29._01_ClassErisimleri.PaketBir.PublicErisim;

public class Bankalar {

    // Bir banka class ı tanımlayınız.
    // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
    // 3 adet constructor ekleyin.
    // toString metodu oluşturun.
    // 3 tane nesne oluşturup mainde yazdırınız.
    public static void main(String[] args) {
        Banka banka1=new Banka();
        Banka banka2=new Banka("Akbank",110,1960);
        Banka banka3=new Banka("Garanti",2727);
        System.out.println("banka1 = " + banka1);
        System.out.println("banka2 = " + banka2);
        System.out.println("banka3 = " + banka3);
    }
}
