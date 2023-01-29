package gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {

        // dizi, array: boyut sayısı belli ve sonradan değiştirilemez
        int[] dizi= new int[5]; // Array 5 elemanlı boyutu sonradan değiştirilemiyor

        // Boyutu dinamik olsun eleman ekledikçe uzasın, sildikçe kısalsın -->
        // ArrayList ‼️: Boyutunu baştan vermeye gerek yok, boyutu başlangıçta 0
        // eleman ekledikçe artar, sildikçe kısalır

        ArrayList<Integer> IntegerList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();
        ArrayList<Double> doubleList=new ArrayList<>();

        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Özge"); // uzunluk 1 oldu
        isimler.add("Gül"); // uzunluk 2 oldu
        isimler.add("Celal"); // uzunluk 3 oldu
        isimler.add("Yangın"); // uzunluk 4 oldu

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add(2,"Yangın");   // verilen indexe ekliyor, gerisi sona doğru 1 kayıyor
        //(index 0'dan başlıyor, uzunluk 1den )
        System.out.println("isimler = " + isimler);

        isimler.set(0,"ÖZGE");  // verilen indexin elemanını değiştirir
        System.out.println("isimler = " + isimler);

        boolean varMi=isimler.contains("Celal");
        System.out.println("varMi = " + varMi);

        isimler.remove("Gül"); // değere göre siler , büyük-küçük harf duyarlı ve ilk yazan "Gül"ü siler
        System.out.println("isimler = " + isimler);

        isimler.remove(1); // rakamı index kabul eder ve ona göre siler, sayı olarak "1" yazsa onu silmez
        //  verilerimiz int olsaydı ve rakam silmek isteseydik  -->  isimler.remove((Objects)1);
        System.out.println("isimler = " + isimler);


        int indexOfCelal= isimler.indexOf("Celal");
        System.out.println("indexOfCelal = " + indexOfCelal);

        String ilkEleman= isimler.get(0); // verilen indexteki değeri verir
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear(); // her şeyi temizliyor, boş haline dönüyor
        System.out.println("isimler = " + isimler);




        }


    }

