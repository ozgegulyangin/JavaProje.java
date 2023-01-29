package gun07;

public class _07_StringStartsWith {
    public static void main(String[] args) {
        // .. bunla başlıyor mu diye soruyoruz
        //sonuc true veya false

        String text="HCL Teknoloji";
        System.out.println("text.startsWith(HC) = " + text.startsWith("HC")); //true
        System.out.println("text.startsWith(te) = " + text.startsWith("te")); //false
        System.out.println("text.startsWith(h) = " + text.startsWith("h")); //false

        //büyük harf duyarlılığı var!!!


    }
}
