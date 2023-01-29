package gun38._03_YemekDunyasi;

import java.util.ArrayList;

public class YemekDunyasiMain {
    public static void main(String[] args) {

        System.out.println("***YEMEK DÜNYASI***");
        System.out.println();

        GreekSalad gs=new GreekSalad();
        gs.setName("Greek Salad");
        gs.madeIn();
        gs.taste();
        System.out.println("------------------");

        SezarSalad ss=new SezarSalad();
        ss.setName("Sezar Salad");
        ss.madeIn();
        ss.taste();
        System.out.println("------------------");

        Baklava baklava=new Baklava();
        baklava.setName("Baklava");
        baklava.madeIn();
        baklava.taste();
        System.out.println("------------------");

        CheeseCake ck=new CheeseCake();
        ck.setName("Cheese Cake");
        ck.madeIn();
        ck.taste();

    }
}
