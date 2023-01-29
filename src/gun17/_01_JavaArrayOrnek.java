package gun17;

public class _01_JavaArrayOrnek {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 0 atayınız  yazdırınız.

       int [] dizi= new int [50];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]= (int)(Math.random()*11); // 10 dahil olsun diye 11 yaptık
            System.out.println("dizi önce=" +dizi[i]); //--> öncesindeki değerini görmek için
            // buraya kadar 50 elemanlı dizi tanımladık ve 10a kadar
            //olan sayılarla doldurduk 1️⃣
        }
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==0)
                dizi[i]=0;
            else
                dizi[i]=1;

            // burada  tek olan kutularda tek yerine 1, çift yerine 0 yazacak. "5,3,7" yerine "1" "2,4,6" yerine "0"

        }


    }
}
