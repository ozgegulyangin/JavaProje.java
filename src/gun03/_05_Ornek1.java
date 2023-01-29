package gun03;

public class _05_Ornek1 {
    public static void main(String[] args) {
        // iki kenarı tanımlı olarak verilen bir dikdörtgenin
        //cevresini ve alanını bulunuz
        //çarpma için * kullanılıyor
        // bir kenarı a ise diğer kenar b ise , cevre=(a+b)*2 , alan=a*b
        int kisaKenar=15;
        int uzunKenar=22;
        int cevre= (kisaKenar+uzunKenar+kisaKenar+uzunKenar );

        System.out.println("cevre = " + cevre);
        int alan=kisaKenar*uzunKenar;
        System.out.println("alan = " + alan);


    }
}
