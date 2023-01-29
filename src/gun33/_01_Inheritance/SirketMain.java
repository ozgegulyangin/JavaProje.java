package gun33._01_Inheritance;

public class SirketMain {
    public static void main(String[] args) {
        Yonetici yonetici=new Yonetici();
        yonetici.setAd("Özge");
        yonetici.setSoyad("Gül");
        yonetici.setTcNo("4162626262672872");
        yonetici.setTelefon("0527282828");
        yonetici.bordroYazdir();

        // personele yazdığımız tüm özellikleri extends sayesinde
        // yonetici için de kullandık

        // Diğer classların her özelliğini ve metodlarını alıp
        //kullanmaya INHERITANCE‼️ yani kalıtım, miras alma denir.

        // classın yanına "extends 'almak istediğimiz class adı' yazıyoruz ve o classtaki
        //her şeyi bu classta da kullanmış oluyoruz.❗️
    }
}
