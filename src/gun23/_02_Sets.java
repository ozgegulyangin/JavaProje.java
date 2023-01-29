package gun23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        // SETS
        // HashSet: Hızlı, bunu için kendine göre algoritmik bir sırada tutar
        // LinkedHashSet: EKLEME SIRASIna göre tutar 
        // TreeSet: Ne eklersen ekle her zaman içide sıralı şekilde tutar, kendinden SORTlu

        HashSet<String>hs=new HashSet<>(); // kendisi nasıl hızlı çalıştırabilecekse öyle sıraladı
        hs.add("özge");
        hs.add("gül");
        hs.add("yangın");
        hs.add("celal");
        System.out.println("hs = " + hs);

        LinkedHashSet<String>lhs= new LinkedHashSet<>(); // ekleme sırasına göre sıraladı
        lhs.add("özge");
        lhs.add("gül");
        lhs.add("yangın");
        lhs.add("celal");
        System.out.println("lhs = " + lhs);

        TreeSet<String>ts=new TreeSet<>();   // alfabetik sıraladı
        ts.add("özge");
        ts.add("gül");
        ts.add("yangın");
        ts.add("celal");
        System.out.println("ts = " + ts);
        
        
        
        
    }
}
