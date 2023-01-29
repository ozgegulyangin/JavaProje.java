package gun07;

public class _05_StringSubstring {
    public static void main(String[] args) {
        // Stringin belli bir bölümünü alma işlemini yapıyor
        //         012345678901234567
        String s1="Merhaba Arkadaşlar";

        String parca1= s1.substring(3,9); // 3 no'lu indexten 9 no'lu indexe kadar alır
        // 9 dahil değil!!!! 3,4,5,6,7,8
        System.out.println("parca1 = " + parca1);

        String parca2= s1.substring(8,15);
        System.out.println("parca2 = " + parca2);

        String parca3= s1.substring(8); // 8'den itibaren sona kadar gider Arkadaşlar yazar
        System.out.println("parca3 = " + parca3);




    }
}
