package gun39._05_OOP_Soru;


import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        ArrayList<IFood> yemekler = new ArrayList<>();


        int secim;
        do {
            menu();
            secim = oku.nextInt();
            switch (secim) {
                case 1:
                    AdanaKebap adanaKebap = new AdanaKebap();
                    yemekler.add(adanaKebap);
                    break;
                case 2:
                    Lahmacun lahmacun = new Lahmacun();
                    yemekler.add(lahmacun);

                    break;
                case 3:
                    Borsh borsh = new Borsh();
                    yemekler.add(borsh);

                    break;
                case 4:
                    Palov palov = new Palov();
                    yemekler.add(palov);
                    break;
                case 0:
                    TechnoKitchen.hazirla(yemekler);

            }

        } while (secim !=0);


    }


    public static void menu() {
        System.out.println("******** TechnoCafe Menü ********");
        System.out.println("1-Adana Kebap -55 TL");
        System.out.println("2-Lahmacun    -33 TL");
        System.out.println("3-Borsh       -33 TL");
        System.out.println("4-Palov       -44 TL");
        System.out.println("0-Tamam");
        System.out.print("Seçiminiz:");
    }


}
