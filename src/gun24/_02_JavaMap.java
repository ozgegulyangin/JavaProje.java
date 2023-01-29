package gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1001, "Özge Gül");  // 1001 K-key,  Özge Gül Yangın V-Value
        hm.put(1002, "Celal Yangın");
        hm.put(2022, "Suay Fidancan");
        hm.put(3001, "Atakan Batmaz");
        hm.put(1001, "Özge Gül Yangın");  // Aynı key'le girilen verilerden son gelen değeri alır
        hm.put(2012, "Celal Yangın");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for (Integer k : hm.keySet()) {
            System.out.print(k+"\t");
        }
        System.out.println();
        
        for (String V:hm.values()) {
            System.out.print(V+"\t");
        }
        System.out.println();
        for (Map.Entry<Integer,String> kv :hm.entrySet()) {
            System.out.println(kv.getKey() +"-"+ kv.getValue());

        }
    }
}
