package gun27._01_Ornek;

public class Utility {

    public String getString2(int sayi) { //1️⃣
        return String.valueOf(sayi);

    }

    public static String getString(int sayi) { //2️⃣
        //STATİC sayesinde  ‼️
        // Utility blabla= new Utility demeden tanımlayabiliyoruz

        return String.valueOf(sayi);
    }

}
/*****************************************************/
// Static olan metodlar SINIF a yani CLASS yani TİPe ait
//STATIC olmayanlar kime ait nesneye ait, mutlaka static
//oluşturulması gerekiyor

// Nesneyi ilgilendiren metodları normal yazıyoruz
// Nesneyi ilgilendirmeyen ,Tipi ilgilendirmeyen
// metodları STATİC ile yazıyoruz.