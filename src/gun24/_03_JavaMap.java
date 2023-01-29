package gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {

        // Bir kartvizit uygulamasını 2 kişi için yapınız

        // 1. Kartvizit
        HashMap<String,String>kartVizit1=new HashMap<>();
        kartVizit1.put("isim", "Özge Gül Yangın");
        kartVizit1.put("email", "ozgegul.93@gmail.com");
        kartVizit1.put("adres", "Yeşilova mah.,Küçükçekmece");
        kartVizit1.put("telefon no:","05301128851");

        //2.Kartvizit
        HashMap<String,String>kartVizit2=new HashMap<>();
        kartVizit2.put("isim", "Celal Yangın");
        kartVizit2.put("email", "celalhan@msn.com");
        kartVizit2.put("adres", "Yeşilova mah.,Küçükçekmece");
        kartVizit2.put("telefon no:","05548616941");


        HashMap<String, HashMap<String,String>> kartvizitler=new HashMap<>();
        kartvizitler.put("Celal",kartVizit2);
        kartvizitler.put("Özge",kartVizit1);

        System.out.println("kartvizitler.get(Özge)= " + kartvizitler.get("Özge"));
        System.out.println("kartvizitler.get(Celal) = " + kartvizitler.get("Celal"));

        // özgenin emailini aldık
        System.out.println("Özge'nin email adresi= " + kartvizitler.get("Özge").get("email"));
        //Celal'in adresini aldık
        System.out.println("kartvizitler.get(Celal).get(adres) = " + kartvizitler.get("Celal").get("adres"));
        //Celal'in ismini aldık
        System.out.println("kartvizitler.get(Celal).get(isim) = " + kartvizitler.get("Celal").get("isim"));


        for (Map.Entry<String, HashMap<String,String>> kv:kartvizitler.entrySet()){  //tüm Mailleri aldık
            System.out.println("kv.getValue().get(email) = " + kv.getValue().get("email"));

        }





    }
}
