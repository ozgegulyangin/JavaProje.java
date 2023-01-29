package gun27._02_Ornek;

public class Soru {

    // Math sınıfndaki metodlarıdan 5 tanesini
    // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
    // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
    // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
    // kullanımlarını yazınız.

    public static void main(String[] args) {

        int max = MyMathClass.maxAl(1, 2);
        int min = MyMathClass.minAl(1, 5);
        int randm=MyMathClass.random(6);
        double us=MyMathClass.usAl(12, 4);
        double karekok= MyMathClass.karekokAl(49);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("randm = " + randm);
        System.out.println("us = " + us);
        System.out.println("karekok = " + karekok);

    }
}
