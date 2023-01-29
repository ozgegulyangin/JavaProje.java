package gun15;

public class _01_JavaNestedLoop {
    public static void main(String[] args) {

        // Aşağıdaki görünümü tek yıldız kullanarak yazdırınız.
        //*****
        //*****
        //*****
        //*****
        //*****

        for(int j=0; j<5; j++) { // j sayaç 1

            for (int i=0;i<5; i++) // i sayac 2
                System.out.print("*");  // bu kısmı hem ilk for hem ikinci for çalıştırıyor toplam 25 kere‼️

            System.out.println(); // burayı sadece ilk for çalıştırıyor 5 kere ‼️


        }




    }
}
