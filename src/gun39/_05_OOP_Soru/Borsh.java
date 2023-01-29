package gun39._05_OOP_Soru;

public class Borsh implements IFood{
    @Override
    public void Taste() {
        System.out.println("Borsh'unuz hazır, afiyet olsun.");
    }

    @Override
    public double ucret() {
        return 33;
    }
    void fry(){
        System.out.println("Kızartılıyor");
    }
    void boil(){
        System.out.println("Haşlanıyor");
    }
}
