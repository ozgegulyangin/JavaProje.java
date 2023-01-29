package gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        double oran= 3.2;
        int sayi =5;

        sayi= (int) oran; // tehlikeli işlem yapıyosun,bundan dolayı challenger patladı.
        //değerlerine bak, eğer oluşan veri kaybını anladıysan ve kabulunse bunu bilerek
        //yaptığını göster sayi=oran değil sayi=(int)oran yaz.

        System.out.println("sayi = " + sayi);

        byte kisaKenar=5;
        byte uzunKenar=7;
        byte cevre= (byte) (kisaKenar+uzunKenar+kisaKenar+uzunKenar);
        // sen eşitliğin 2. tarafındaki rakamları toplayınca toplam int durumunda bir sayı oldu
        // işlem sonucunda sorun  oluşuyor
        //byte cevre= 5+5+7+7 ; // int ->byte atmaya çalışıyorsun.
        //eğer veri kaybu olmayacağından eminsen veya veri kaybı önemli değilse bana bunu yazarak göster
        // byte cevre= (kisaKenar+kisaKenar+uzunKenar+uzunKenar)değil --->
        // byte cevre= (byte)(kisaKenar+kisaKenar+uzunKenar+uzunKenar) yaz!!!
        System.out.println("cevre = " + cevre);
        int cevre2= kisaKenar+kisaKenar+uzunKenar+uzunKenar; // alternatif
        System.out.println("cevre2 = " + cevre2);





    }
}
