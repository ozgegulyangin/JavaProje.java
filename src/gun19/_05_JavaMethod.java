package gun19;

public class _05_JavaMethod {
    // buraya metodlar yazılabilir
    public static void main(String[] args) { // ana metod, diğer metodlar buradan çağırılacak

        Math.max(5,6); // bazı değerler veriyorsun, geriye istenen değeri veriyor
        Math.random(); // veri almıyor, veri veriyor

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        System.out.println("------------");

        merhabaYaz();// kullanımı kolay, çağırması kolay, tekrar tekrar kulanabilirsin
        merhabaYaz();// mainin daha kolay anlaşılabilir olur.
        merhabaYaz();// fonksiyonu çağırma şekli

    }
    public static void merhabaYaz() {   // kendi metodumuzu tanımladık
        System.out.println("Merhaba Dünya");

    }
    // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    // temiz kod için

    // buraya metodlar yazılabilir
}
