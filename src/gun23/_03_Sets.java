package gun23;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {

        HashSet<String>renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");
        // Ekrana Yazdırma
        System.out.println("renkler = " + renkler);
        
        // Ekrana nasıl tek tek yazdırırım?

        for (String eleman :renkler) {  // for each❕karışık sırayla alt alta yazdırır
            System.out.println("eleman = " + eleman);
            
            
        }
        /* for eacle ilgili örnek olsun diye yaptık ❕❕❕
        FOR EACH random sıralıyor kafasına göre
        int [] dizi= {34,5,6,7,8,89,899,77};
        for (int sayi:dizi) {    // for each her yerde kullanılabiliyor !!!!!!
            System.out.println("sayi = " + sayi);
        }    */


        // ITERATOR : set in kendi sırası nasılsa öyle sıralıyor, hasNext= sıradaki eleman var ise
        // adım adım gösteriyor
        Iterator gosterge= renkler.iterator();   // yazdığın sırayla  alt alta yazdırır
        while (gosterge.hasNext()) {
            System.out.println("gosterdigi eleman = " + gosterge.next());
            // .next göstergenin gödterdiği elemanı temsil ediyor

        }

        
    }
}
