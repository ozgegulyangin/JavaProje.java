package gun30._02_FinalDegiskenler.Ornek1;

public class NufusMudurlugu {
    public static void main(String[] args) {


        Vatandas v1 = new Vatandas("Aynur");
        Vatandas v2 = new Vatandas("Ali Cabir");
        Vatandas v3 = new Vatandas("Işıl");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        //   v2.tcNo=456; Cannot assign a value to final variable 'tcNo'

        /*******************************************/
        //‼️ final : değer atandıktan sonr deiştirilmeyi
        // engelliyor. Bu sayede hem sabit değerler için
        // hem de sonradan değişmesini istemediğimiz değerler
        //için kullanılır
        //‼️static sayac ise: her yeni nesne oluşturulduğunda
        // yeni artan değer almasını sağlıyor.

        final double pi = 3.14;
        //pi=5; sonradan değiştirilemez, final değerini kabul eder

    }
}