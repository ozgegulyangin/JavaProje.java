package gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {

        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi ArrayList için Collection kullanıcaz

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);
        System.out.println("sayilar = " + sayilar);

        // Sıralama işlemi
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);
        
        // Tersine çevir
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);
        
        // Max ve Min değeri bulma
        System.out.println("sayilar = " + Collections.max(sayilar));
        System.out.println("sayilar = " + Collections.min(sayilar) );
        
        // Bütün elemanları set etme
        Collections.fill(sayilar,0);  // tüm elemanlara istediğimiz rakamı atarız
        System.out.println("sayilar = " + sayilar);

        //Replace
        Collections.replaceAll(sayilar,0,5);   // 0'ları 5'le değiştirme
        System.out.println("sayilar = " + sayilar);

        // tanımlarken değer atama
        int[]dizi={1,2,3,4};
        ArrayList<Integer>liste=new ArrayList<>(Arrays.asList(3,4,5,6));
        System.out.println("liste = " + liste);
        ArrayList<String> strListe= new ArrayList<>(Arrays.asList("Özge","Celal","Yangın"));
        System.out.println("strListe = " + strListe);
        
        ArrayList<Integer>Liste2= new ArrayList<>();  // Listeye yeni eleman ekledik ‼️
        Collections.addAll(Liste2,2,3,4,5);
        System.out.println("Liste2 = " + Liste2);
        
        // diziyi direkt Arrayliste atma;
        Integer [] dizi2={2,3,4,5,6,8};    // int primitive tip sadece sayı saklayabiliyor
        // Integer  sayı saklayabilir ve kendine has metodları var primitive değil‼️
        ArrayList<Integer>liste3= new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("liste3 = " + liste3);


    }
}
