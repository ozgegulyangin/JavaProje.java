package gun33._02_Ornek;

public class HayvanatBahcesi {
//    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
//    Kediler için (renk,kilo,cinsi)
//    kopekler için (renk,kilo, cinsi)
//    yılanlar için renk, kilo, cinsi, uzunluk)
//    ordek için (renk, kilo, cinsi, kanatAcikligi)
//    bütün hayvanların konustu metodu vardır.

    public static void main(String[] args) {

        Kopek kopek = new Kopek("beyaz", 35, "Golden");
        System.out.println(kopek);
        kopek.konustur();

        Kedi kedi = new Kedi("Füme", 9, "Tekir");
        System.out.println(kedi);
        kedi.konustur();

        Yilan yilan = new Yilan("Yeşil", 12, "Piton", 10);
        System.out.println(yilan);
        yilan.konustur();

        Ordek ordek = new Ordek("Mavi,Yesil", 6, "Yeşil Ördek", 7);
        System.out.println(ordek);
        ordek.konustur();


    }
}
