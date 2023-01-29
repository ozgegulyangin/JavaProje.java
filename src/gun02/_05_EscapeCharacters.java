package gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {
        // Escape Characters \'dan itibaren gelen karakterlere denir.
        // \n ->  yeni satır açıyor, alt satıra geçiyor
        // \t -> sanki tab tusuna basmıs gibi boşluk veriyor
        // \b -> back-space gibi bir karakter geri siler
        // \" -> Çift tırnak " yazmak için kullanır
        // \\ -> ters slash \ yazmak için kullanılır
        // \r -> satır başına geri gider, satırı silip tekrar baştan yazıyormus gibi yapar
        System.out.println("MerhabaDünya");
        System.out.println("Merhaba \n Dünya");
        // print veya println \ görünce bu ekrana yazılacak bir karakter değil,
        // ayrı bir iş yapmam isteniyor, devam eden n karakterini görünce
        // ayrı işin alt satıra geçmek olduğunu anlıyor
        System.out.println("Merhaba\tDünya"); //Merhaba  Dünya
        System.out.println("Merhaba\bDünya");  // MerhabDünya
        System.out.println("Merhaba\"Dünya"); //Merhaba"Dünya
        System.out.println("Merhaba\\Dünya"); //Merhaba\Dünya
        System.out.println("Merhaba\rDünya"); // Dünya

    }
}
