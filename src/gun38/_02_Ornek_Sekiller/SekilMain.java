package gun38._02_Ornek_Sekiller;
       /*1- içinde name field ı olan Sekil isimli bir Abstract Class yazınız.
        2- Bu classın Alan ve cevre abstract metodları ve içind eAlan ve cevre nin sonucu olan toString somut metodu,
        sekilin adını veren getName somut metodu ve ciz isimli somut metodlarını ekleyiniz.
        3- Bu sınıftan Dikdörtgen ve Daire isimli 2 class oluşturunuz.
        4- Bunlardan birer örnek main metodunda çalıştırınız.*/

public class SekilMain {
    public static void main(String[] args) {

        Dikdortgen d1=new Dikdortgen(4,5);
        d1.setName("dikdörtgen");
        d1.sekilCizildi();
        System.out.println(d1);

        Daire d2=new Daire(5);
        d2.setName("daire");
        d2.sekilCizildi();
        System.out.println(d2);

    }
}
