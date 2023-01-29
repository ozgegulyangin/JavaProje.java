package gun37._02_Soru;

import java.util.ArrayList;

public class CiftlikMain {
    public static void main(String[] args) {

        Cat kedi = new Cat();
        Swallow kirlangic = new Swallow();
        Duck ordek = new Duck();
        Shark kopekbaligi = new Shark();
        ArrayList<Animal> hayvanlar = new ArrayList<>();

        hayvanlar.add(kedi);
        hayvanlar.add(kirlangic);
        hayvanlar.add(ordek);
        hayvanlar.add(kopekbaligi);

        for (Animal a : hayvanlar) {
            a.food();
            System.out.println("----------------------------");
            System.out.println(a.getClass().getSimpleName());// classın adını verir
            System.out.println("Food= " + a.food());

            if (a instanceof Cat) {

                System.out.println(((Cat) a).kedi());
            } else if (a instanceof Swallow) {

                System.out.println(((Swallow) a).ucar());
            } else if (a instanceof Duck) {

                System.out.println(((Duck) a).ucar());
                System.out.println(((Duck) a).yuzer());
            } else if (a instanceof Shark) {

                System.out.println(((Shark) a).yuzer());
            }

        }

    }


}


