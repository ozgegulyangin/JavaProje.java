package gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        // Map --> HashMap, LinkedHashMap, TreeMap
        // Map 'te index kullanmıyoruz artık
        // Map = Anahtar + Set  --> Anahtarlı Set
        // Set gibi tekrarlı ifade yok, TC gibi tel no gibi benzersiz

        // anahtarın tipi Integer, değerinin tipi String olsun
        //HashMap<K (KEY), V (Value)>    Value tekrarlı olabiliyor, Key benzersiz

        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1001, "Özge Gül");  // 1001 K-key,  Özge Gül Yangın V-Value
        hm.put(1002, "Celal Yangın");
        hm.put(2022, "Suay Fidancan");
        hm.put(3001, "Atakan Batmaz");
        hm.put(1001, "Özge Gül Yangın");  // Aynı key'le girilen verilerden son gelen değeri alır
        hm.put(2012, "Celal Yangın");  // Farklı Key ile aynı Value girebiliyoruz

        System.out.println("hm = " + hm);
        System.out.println("hm.get(1002) = " + hm.get(1002));

        System.out.println("hm.containsKey(2022) = " + hm.containsKey(2022));  //True--- bu Key var mı yok mu kontrol ettik
        System.out.println("hm.containsKey(13) = " + hm.containsKey(13));  // False

        System.out.println("hm.keySet() = " + hm.keySet());  // keyleri çağırıyoruz
        System.out.println("hm.values() = " + hm.values());   // value leri çağırıyoruz
        System.out.println("hm.entrySet() = " + hm.entrySet());  // hepsini çağırıyoruz
         
        hm.remove(1002);
        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());
        
        hm.clear();
        System.out.println("hm = " + hm);







    }
}
