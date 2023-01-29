package gun37._01_Soru;

import java.util.ArrayList;

public class FabrikaMain {
   /* Ekteki Tasarıma göre gerekli modülleri yazınız.
    Sonra bir main metodunda, TeslaCar dan, ToyotaPirus
    dan ve cityBus dan birer nesne üretiniz.
  - ürettiğiniz nesneleri bir ArrayListe ekletip, daha sonra
    bu ArrayList i bir döngü ile metodlarını ekrana yazdırınız.
    engine (double)
    model (String)
    metodların hepsinin tipi String*/

    public static void main(String[] args) {

        TeslaCar tesla=new TeslaCar("A",1000);
        ToyotaPrius toyota=new ToyotaPrius("B",1500);
        cityBus bus=new cityBus("C",800);

        ArrayList<Vehicle>arabalar=new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(toyota);
        arabalar.add(bus);

        for (Vehicle a: arabalar) {
            System.out.println("----------------------------");
            System.out.println(a.getClass().getSimpleName());// classın adını verir
            System.out.println("a.getModel() = " + a.getModel());
            System.out.println("a.getEngine() = " + a.getEngine());

            if (a instanceof TeslaCar){
                System.out.println(((TeslaCar)a).changeBattrery());
                System.out.println(((TeslaCar)a).drive());}
            else
                if (a instanceof ToyotaPrius){
                    System.out.println(((ToyotaPrius)a).changeBattrery());
                    System.out.println(((ToyotaPrius)a).drive());
                    System.out.println(((ToyotaPrius)a).changeOil());}
            else
                if (a instanceof cityBus){
                    System.out.println(((cityBus)a).drive());
                    System.out.println(((cityBus)a).changeDiesel());}

        }

        }
    }
