package gun31._04_EnumSoru;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
// Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.


    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        ArrayList<Pizza> siparisler = new ArrayList<>();
        PizzaSize size = PizzaSize.Small;

        int toplam = 0;
        int secim;
        do {
            //menu
            menu();
            secim = oku.nextInt();
            switch (secim) {
                case 1:
                    Pizza sp = new Pizza(PizzaSize.Small);

                    siparisler.add(sp);
                    break;//small
                case 2:
                    Pizza mp = new Pizza(PizzaSize.Medium);
                    siparisler.add(mp);

                    break;//medium
                case 3:
                    Pizza lp = new Pizza(PizzaSize.Large);
                    siparisler.add(lp);

                    break;//large
                case 4:
                    siparisGoster(siparisler); //siparişi göster
            }
            // orada hangi pizzadan kaç siparis verdiğini göster

        } while (secim < 4);
    }

    public static void menu() {
        System.out.println("******** Pizza Menü ********");
        System.out.println("1-Small");
        System.out.println("2-Medium");
        System.out.println("3-Large");
        System.out.println("4-Siparişinizi Gösteriniz:");
        System.out.print("Seçiminiz:");
    }

    public static void siparisGoster(ArrayList<Pizza> siparisler) {
        int small = 0, medium = 0, large = 0;

        for (Pizza p : siparisler) {
            if (p.size == PizzaSize.Small) small++;
            else
                if (p.size == PizzaSize.Medium) medium++;
            else
                if (p.size == PizzaSize.Large) large++;

        }
        System.out.println("**** SİPARİŞLERİNİZ ****");
        System.out.println("Small  Pizza  Adeti: " + small);
        System.out.println("Medium Pizza  Adeti: " + medium);
        System.out.println("Large  Pizza  Adeti: " + large);
        System.out.println("Sipariş edilen toplam pizza adeti: "+(small+medium+large));

    }

}
