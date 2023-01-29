package gun39._05_OOP_Soru;

public class Lahmacun implements IFood {
    @Override
    public void Taste() {
        System.out.println("Lahmacununuz hazır, afiyet olsun.");

    }

    @Override
    public double ucret() {
        return 33;
    }

    void dough() {
        System.out.println("Hamur hazırlanıyor");

    }

    void addMeat() {
        System.out.println("Kıyma harcı ekleniyor");
    }

    void bake(){
        System.out.println("Odun ateşinde pişiyor");

    }
}
