package gun27._03_Ornek;

import java.util.ArrayList;

public class Student {

        String name;
        int maxSaat;
        ArrayList<Lesson> dersleri = new ArrayList<>();
        // hem derslerin ismini hem de saatini saklayacak bu yüzden <Lesson>

        public void dersEkle(Lesson ders) {
            int suAnToplamSaat = 0;
            for (Lesson d : dersleri)
                suAnToplamSaat += d.saat;
            int kalanKredi=10-suAnToplamSaat;

            if (suAnToplamSaat + ders.saat <= maxSaat)
                dersleri.add(ders);
            // son eklenen ders ile max'ı geçiyor mu? burada onu kontrol ettik
            else
                System.out.println(ders.name + " ile kredi sınırı aşıldı");
        }
        public void dersleriYazdir() {
            System.out.println("\n*** Transkript ***");
            System.out.println("Sayın " + name);
            System.out.println("Aldığınız dersler aşağıdadır.");
            for (Lesson d : dersleri)
                System.out.println(d.name + " " + d.saat);

        }
        public static void universiteKurallari(){
            System.out.println("********************************");
            System.out.println("Kural 1:Derslere geç kalmayınız.");
            System.out.println("Kural 2:Kapalı alanlarda sigara içmeyiniz");
            System.out.println("Kural 3:Eğlenmeyi unutmayınız");
            System.out.println("********************************");

        }
    }


