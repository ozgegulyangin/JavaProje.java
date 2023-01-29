package gun24;

import java.util.*;

public class _04_JavaMap {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>(); // hızlı çalışmak için kendisine göre sıralı
        // Map<Integer,String>hm=new HashMap<>();
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"köpek");
        hm.put(11,"kuş");
        hm.put(4,"kurt");
        System.out.println("hm = " + hm);

        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(); // eklendiği sıraya göre sıralı
        //Map<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"köpek");
        lhm.put(11,"kuş");
        lhm.put(4,"kurt");
        System.out.println("lhm = " + lhm);

        TreeMap<Integer,String> tm=new TreeMap<>();  // Her zaman sıralı kendinden sortlu
        //Map<Integer,String> thm=new TreeMap<>();
        tm.put(9,"tilki");
        tm.put(2,"kedi");
        tm.put(30,"köpek");
        tm.put(11,"kuş");
        tm.put(4,"kurt");
        System.out.println("tm = " + tm);


    }
}
