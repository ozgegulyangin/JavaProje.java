package gun17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _06_ArrayMethods {
    public static void main(String[] args) {

        String [] isimler={"Özge", "Celal"};

        // diziyi String olarak direkt yazar
        System.out.println("isimler="+ Arrays.toString(isimler));

        // dizi sıralama harfe göre
        Arrays.sort(isimler);
        System.out.println("isimler=" +Arrays.toString(isimler));

        // diziler eşit mi?
        int [] a={1,8,3,54};
        int [] b={1,8,3,54};
        int [] c={1,8,2,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); // true
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c)); // false
        
        // sayıları sıralama
        Arrays.sort(c);
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));

        // CONTAİNS gibi çalışır, aranan değer var ise pozitif bir değer döndürür yoksa negatif.
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b,3)); // sıralı olmayınca bulamıyor
        Arrays.sort(b);
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b,54));

    }
}
