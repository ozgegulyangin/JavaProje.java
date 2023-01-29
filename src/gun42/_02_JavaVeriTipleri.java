package gun42;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {
        
        // ilkel tipler : primitive types: short,byte,long,int,float,double,boolean
        
        int sayi1=5;
        int sayi2=10;
        sayi1=sayi2; // sayi1=10 oldu
        // eşitlesek bile değerler atanır ama kendi hücreleri yine ayrı ayrı kalır
        // yani en son ne atarsak o değeri alır kalır
        sayi1=34;
        sayi2=45;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);


        // Referans tipler: class, dizi,array, nesneler...

        int [] dizi1={1,2,3,4};
        int [] dizi2={5,6};
        System.out.println("dizi 1 = " + Arrays.toString(dizi1)); // 1,2,3,4
        System.out.println("dizi 2 = " + Arrays.toString(dizi2)); // 5,6
        dizi1=dizi2;  // dizi 1 ve dizi2 aynı şey oldular bu işlemle
        System.out.println("dizi 1 = " + Arrays.toString(dizi1)); //5,6
        System.out.println("dizi 2 = " + Arrays.toString(dizi2)); //5,6

        dizi1[0]=67;
        System.out.println("dizi 1 = " + Arrays.toString(dizi1)); //67,6
        System.out.println("dizi 2 = " + Arrays.toString(dizi2)); //67,6

        dizi2[1]=55;
        System.out.println("dizi 1 = " + Arrays.toString(dizi1)); //67,55
        System.out.println("dizi 2 = " + Arrays.toString(dizi2)); //67,55
        
        // Nesne tipler: String, Integer,Double,Long   -->** NULL alabilen ilkel tipler
       // referans tip gibi değil ilkel tip gibi davranıyor
        String ad1="Özge";
        String ad2="Celal";
        
        ad1=ad2;   // aynı değer farklı kutucuk
        System.out.println("ad1 = " + ad1); // Celal
        System.out.println("ad2 = " + ad2); // Celal
        
        ad1="Yangın";
        System.out.println("ad1 = " + ad1); // Yangın
        System.out.println("ad2 = " + ad2); // Celal
        


    }
}
