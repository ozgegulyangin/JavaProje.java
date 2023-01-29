package gun13;

public class _02_WhileLoop {
    public static void main(String[] args) {
        // Ekrana 5 kez Merhaba yazdırınız

        int sayac=1;
        while (sayac<6) // ....iken yap: şartı yazıyoruz,dönme şartı
        {// her döndüğünde yapılacaklar: tekrarlanacak şey süslü parantez içine yazılır

            System.out.println(sayac+ "Merhaba");
            sayac++ ; // sayac=sayac+1
            // sayacı iki arttırmak için sayac

        }

        System.out.println("bitti"); // bu {} bunun içine de yazılabilir
        // ama döngünün bittigi belli olsun diye aşağı yazdık


    }
}
