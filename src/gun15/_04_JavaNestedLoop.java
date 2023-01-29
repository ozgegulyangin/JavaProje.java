package gun15;

public class _04_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *****    1.Satırda 5
        // ****     2.Satırda 4
        // ***      3.Satırda 3
        // **       4.Satırda 2
        // *        5.Satırda 1

        for (int c=5; c>=1; c--) {  // kaç satır olacağını burası belirliyor

            for (int i = 0; i < c; i++) // her bir satırdA KAÇ YILDIZ OLACAĞINI BURASI BELİRLİYOR.
                // Sınırın değişken olması lazım
                // "c" 1-2-3-4-5 seklinde gittiği için "i" 1 2 3 4 5 şeklinde 1 artarak ilerler

                System.out.print("*");

            System.out.println(); // bir alt satıra geçiyor

        }
    }
}
