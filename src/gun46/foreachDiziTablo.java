package gun46;

public class foreachDiziTablo {
    public static void main(String[] args) {
        // tek boyutlu diziler
        System.out.println("******TEK BOYUTLU DİZİLER******");
        int[] dizi = new int[]{1, 2, 3, 4, 6};
        int dizi1[] = {1, 2, 3, 4, 5};
        int[] dizi2 = new int[3];

        dizi2[0] = 5;
        dizi2[1] = 5;
        dizi2[2] = 5;

        System.out.println("dizi1.length = " + dizi1.length); // dizinin eleman sayısı
        // index sırasıyla gittiği için SIRA GARANTİ
        for (int i = 0; i < dizi1.length; i++) { // dizinin uzunluğuna kadar bütüm elemanları yazdırır
            System.out.print(dizi1[i] + " ");
        }
        System.out.println();
        // sıra garanti değil indexe göre takip etmiyor, bütün elemanları alır
        for (int eleman : dizi1) {
            System.out.print(eleman + " ");
        }
        System.out.println();

        // **********İKİ BOYUTLU DİZİLER***********
        System.out.println("******İKİ BOYUTLU DİZİLER******");
        int[][] tablo1 = new int[2][3];
        tablo1[0][0] = 4;
        tablo1[0][1] = 14;
        tablo1[0][2] = 22;  // 1. satır
        tablo1[1][0] = 24;
        tablo1[1][1] = 33;
        tablo1[1][2] = 12;  // 2.satır

        int[][] tablo2 = {{1, 3, 4}, {56, 7, 8}};


        int tablo3[][] = new int[2][3];
        tablo3[0] = new int[]{2, 3, 4, 5, 6};
        tablo3[1] = new int[]{2, 3};

        int tablo4[][] = new int[2][3];

        System.out.println("tablo3.length = " + tablo3.length); // tablo3'ün satır sayısı
        System.out.println("tablo3[0].length = " + tablo3[0].length); // 0. satırın uzunluğu
        System.out.println("tablo3[1].length = " + tablo3[1].length); // 1. satırın uzunluğu


        System.out.println("TABLO 3 FOR İ ile");
        for (int i = 0; i < tablo3.length; i++) {  // i:0 ,i:1  burada tablo3'ün satır sayısını alıyoruz
            for (int j = 0; j < tablo3[i].length; j++) { // tablo[0]=5, tablo[1]=2  değerleri gelir
                System.out.print(tablo3[i][j] + " ");// 0. satır için 00,01,02,03,04
                // 1. satır için 10,11

            }
            System.out.println();
        }
        System.out.println("TABLO 3 foreach ile");
        for (int[] satir : tablo3) {// tablo3'ün elemanları satırlardan oluşuyor, onların da her biri tek boyutlu dizi
            for (int eleman : satir) {  // satırın elemananları yani int yani sayi
                System.out.print(eleman + " ");
            }
            System.out.println();
        }
        System.out.println("Tablo 3 foreach - fori iç içe");

        for (int[] satir : tablo3) {
            // 1. Adım   satır 2 3 4 5 6   asağıdaki döngü sadece 2,3
            // 2. Adımda satır 2,3         aşağıdaki döngü
            for (int i = 0; i < tablo3.length; i++) {
                System.out.print(satir[i]+" ");
            }
            System.out.println();
        }

    }
}
