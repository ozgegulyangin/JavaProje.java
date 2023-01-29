package gun03;
    // command+option+L ile ekran düzenli hale geliyor
public class _02_Degiskenler {
    public static void main(String[] args) {
        int sayi = 5;

        int kisaKenar = 5;
        int uzunKenar = 7;

        int cevre= kisaKenar + kisaKenar + uzunKenar + uzunKenar;
        // cevre= (kisaKenar+uzunKenar)*2 diyebiliriz
        System.out.println("cevresi=" + cevre);
        System.out.println("cevre = " + cevre);
        System.out.println("cevre = " + cevre);


    }
}
