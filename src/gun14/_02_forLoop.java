package gun14;

public class _02_forLoop {
    public static void main(String[] args) {
        // ‼️1-Başı belli sonu belli; yani kaç adım döneceği belli ve artıs miktarı belli ise
        //FOR döngüsüdür
        //2- Kaç kere döneceği belli değil ise (kullanıcı 0 değeri girene kadar) WHİLE döngüsüdür
        // 3- While döngüsü döngü kontrolü işlemden son ise DO-WHİLE döngüsüdür ‼️



        //SORU: 1den 5e kadar olan sayıları ekrana yazdırınız

        int i=1;
        while (i<=5) // while döngüsü kaç kere döneceği belli olmayan durumlarda kullanılır
        {
            System.out.println("w_i=" + i);  // while_i :w_i
            i++;
        }
        // for döngüsü başı belli, sonu belli, artışı belli ise kullanılır
        // örneğin; kullanıcı 0 değerini girene kadar derse while çünkü belli değil
        // kullanıcı 1-5 arası değer girecek derse for kullanılır
        for ( i=1; i<=5; i++){
            System.out.println("f_i=" +i);}  // f_i = for_i
        // RUN da karışmasın diye w   -   f ayırdık

        // 1-Başı belli sonu belli; yani kaç adım döneceği belli ve artıs miktarı belli ise
        //FOR döngüsüdür
        //2- Kaç kere döneceği belli değil ise (kullanıcı 0 değeri girene kadar) WHİLE döngüsüdür
        // 3- While döngüsü döngü kontrolü işlemden son ise DO-WHİLE döngüsüdür


    }
}
