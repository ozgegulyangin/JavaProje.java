package gun23;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class _05_Soru {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10 dahil olan sayılarla) doldurduktan sonra
        // tekrarlı değer almayacak şekilde yeni bir diziye atınız.

        Integer [] dizi= new Integer[10];
        
        
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]= (int)(Math.random()*11);
            
        }
        System.out.println("random doldurduğumuz dizi = " + Arrays.toString(dizi));

        // 1.yöntem ‼️
        HashSet<Integer>tekrarsizDizi=new HashSet<>();
        for (int i = 0; i < dizi.length; i++) {
            tekrarsizDizi.add(dizi[i]); // i dersek index bakar HashSet'te index yok 
            // dizi[i]'deki değer lazım bize

            
        }
        System.out.println("tekrarsizDizi = " + tekrarsizDizi);

        // 2. yöntem ‼️
        HashSet<Integer>tekrarsizDizi2=new HashSet<>(Arrays.asList(dizi));
        System.out.println("tekrarsizDizi2 = " + tekrarsizDizi2);

        // 3. yöntem
        HashSet<Integer>tekrarsizDizi3= new HashSet<>();
        Collections.addAll(tekrarsizDizi3,dizi);
        System.out.println("tekrarsizDizi3 = " + tekrarsizDizi3);


    }
}
