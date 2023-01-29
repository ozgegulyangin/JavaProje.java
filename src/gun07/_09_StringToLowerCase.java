package gun07;

public class _09_StringToLowerCase {
    public static void main(String[] args) {
        // toLowerCase: girilen kelimeyi küçük harfe çeviriyor
        
        String text= "Merhaba Dünya";
        System.out.println("orijinal text = " + text); //Merhaba Dünya
        System.out.println("text.toLowerCase() = " + text.toLowerCase()); // merhaba dünya

        System.out.println("me ile veya ME ile başlıyormu = " + text.toLowerCase().startsWith("me"));
        // küçük har mi büyük har mi bakmaksızın "me" ile başlıyor mu diye kontrol ediyor
        //çünkü toLowerCase hepsini küçük harfe çevirdiği için duyarlılığı kaldırmış oluyorsun
        // me ile başlayıp başlamadığını kontrol etmiş oluyorsun



    }
}
