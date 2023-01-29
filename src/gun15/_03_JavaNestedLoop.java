package gun15;

public class _03_JavaNestedLoop {
    public static void main(String[] args) {
// Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *        1.Satırda 1 yıldız
        // **       2.satırda 2 yıldız
        // ***      3.satırda 3 yıldız
        // ****     4.satırda 4 yıldız
        // *****    5.satırda 5 yıldız


       for (int c=1; c<=5; c++){  // kaç satır olacağını burası belirliyor

          for(int i=0; i<c; i++) // her bir satırdA KAÇ YILDIZ OLACAĞINI BURASI BELİRLİYOR.
              // Sınırın değişken olması lazım
              // "c" 1-2-3-4-5 seklinde gittiği için "i" 1 2 3 4 5 şeklinde 1 artarak ilerler

            System.out.print("*");

          System.out.println(); // bir alt satıra geçiyor



       }

    }
}
