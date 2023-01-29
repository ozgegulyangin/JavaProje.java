package gun39._05_OOP_Soru;


import Utility.MyFunction;

import java.util.ArrayList;

public class TechnoKitchen {

    public static void hazirla(ArrayList<IFood> siparisler) {
        int adanaKebap = 0, lahmacun = 0, borsh = 0, palov = 0;

        for (IFood a : siparisler) {
            System.out.println("*******************************");
            MyFunction.Bekle(2);
            if (a instanceof AdanaKebap) {
                System.out.println("Adana Siparişiniz Alındı...");
                System.out.println("** Hazırlanmaya Başlandı **");
                AdanaKebap adanaKebap1 = new AdanaKebap();
                adanaKebap1.marinade();
                adanaKebap1.grill();
                adanaKebap1.Taste();
                adanaKebap++;

            } else if (a instanceof Lahmacun) {
                System.out.println("Lahmacun Siparişiniz Alındı");
                System.out.println("** Hazırlanmaya Başlandı **");
                Lahmacun lahmacun1 = new Lahmacun();
                lahmacun1.dough();
                lahmacun1.addMeat();
                lahmacun1.bake();
                lahmacun1.Taste();
                lahmacun++;

            } else if (a instanceof Borsh) {
                System.out.println("Borsh Siparişiniz Alındı");
                System.out.println("** Hazırlanmaya Başlandı **");
                Borsh borsh1 = new Borsh();
                borsh1.fry();
                borsh1.boil();
                borsh1.Taste();
                borsh++;

            } else if (a instanceof Palov) {
                System.out.println("Palov Siparişiniz Alındı");
                System.out.println("** Hazırlanmaya Başlandı **");
                Palov palov1 = new Palov();
                palov1.boil();
                palov1.eatTomorrow();
                palov1.Taste();
                palov++;

            }

        }
        Lahmacun l=new Lahmacun();
        AdanaKebap ak=new AdanaKebap();
        Borsh b=new Borsh();
        Palov p=new Palov();

        double toplam = ((ak.ucret()*adanaKebap) + (lahmacun*l.ucret())+(borsh*b.ucret())+(p.ucret()*palov));
        MyFunction.Bekle(2);
        System.out.println("**** SİPARİŞLERİNİZ ****");
        System.out.println("Sepetinizde " + (lahmacun + palov + adanaKebap + borsh) + " adet ürününüz var.");
        System.out.println("Hesabınız:"+toplam+" TL");





    }

}
