package gun07;

public class _10_StringToUpperCase {
    public static void main(String[] args) {
        // toUpperCase: büyük harf haline çeviriyor
        String text= "Merhaba dünya";

        System.out.println("orijinal text = " + text);
        System.out.println("text.toUpperCase() = " + text.toUpperCase());
        System.out.println("me veya ME ile başlıyormu = " + text.toUpperCase().startsWith("ME")); //true



    }
}
